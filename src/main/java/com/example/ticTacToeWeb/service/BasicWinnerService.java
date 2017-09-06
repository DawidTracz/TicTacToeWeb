package com.example.ticTacToeWeb.service;

import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import org.springframework.stereotype.Service;

@Service
public class BasicWinnerService {


    public char selectWinner(TicTacModel ticTacModel) {



        // <--------Parameters for checking who is the Winner ------------>


        char winner = ' ';
        boolean haveWinner = false;
        String boardSymbols = ticTacModel.getBoardSymbols();
        int rowsNum = ticTacModel.getRows();
        int numberOfCells = (int) Math.pow(rowsNum, 2);
        int initialCondition = 0;
        int finalCondition = 0;
        int scope = 0;
        char toCheck = ' ';



        if (!haveWinner) {
            if (boardSymbols.charAt(0) != ' ') {
                for (int i = 1; i < rowsNum; i++) {   //1st horizontal
                    toCheck = boardSymbols.charAt(0);
                    if (boardSymbols.charAt(i) != toCheck) {
                        haveWinner = false;
                        toCheck = ' ';
                        break;
                    } else {
                        winner = toCheck;
                        haveWinner = true;
                    }
                }
                if (!haveWinner) {
                        toCheck = boardSymbols.charAt(0);
                    for (int i = rowsNum ; i < numberOfCells; i += rowsNum) {   //1st vertical
                        if (boardSymbols.charAt(i) != toCheck) {
                            haveWinner = false;
                            toCheck = ' ';
                            break;
                        } else {
                            winner = toCheck;
                            haveWinner = true;
                        }
                    }
                    if (!haveWinner) {
                            toCheck = boardSymbols.charAt(0);
                        for (int i = rowsNum+1; i < numberOfCells + 1; i += rowsNum+1) { //1st cross
                            if (boardSymbols.charAt(i) != toCheck) {
                                haveWinner = false;
                                toCheck = ' ';
                                break;
                            } else {
                                winner = toCheck;
                                haveWinner = true;
                            }
                        }
                    }
                }
            }
        }
        if (!haveWinner) {
            for (int i = 1; i < numberOfCells; i++) {
                if (boardSymbols.charAt(i) != ' ') {
                    if (i < rowsNum) {  //Vertical set
                        toCheck = boardSymbols.charAt(i);
                        initialCondition = i + rowsNum;
                        finalCondition = numberOfCells;
                        scope = rowsNum;
                    } else if (i % rowsNum == 0) { // Horizontal set
                        toCheck = boardSymbols.charAt(i);
                        initialCondition = i + 1;
                        finalCondition = i + (rowsNum - 1);
                        scope = 1;
                    }
                }
            }
                for (int j = initialCondition; j < finalCondition; j += scope) {
                    if (boardSymbols.charAt(j) != toCheck) {
                        haveWinner = false;
                        toCheck = ' ';
                        break;
                    } else {
                        winner = toCheck;
                        haveWinner = true;
                    }
                }
            }
        if (!haveWinner && boardSymbols.charAt(rowsNum - 1) != ' ') {
            toCheck = boardSymbols.charAt(rowsNum - 1);
            for (int j = (rowsNum - 1)+(rowsNum - 1); j < (numberOfCells + 1) - rowsNum; j += rowsNum - 1) {
                if (boardSymbols.charAt(j) != toCheck) {
                    haveWinner = false;
                    toCheck = ' ';
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;
                }
            }
        }

        if (!haveWinner && !boardSymbols.contains(" ")) {
            winner = 'D';
            haveWinner=true;
        }

        System.out.println(haveWinner);
        System.out.println("winner is " +  winner);
        return winner;
    }
}

