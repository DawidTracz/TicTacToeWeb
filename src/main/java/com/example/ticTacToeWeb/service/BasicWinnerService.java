package com.example.ticTacToeWeb.service;

import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import org.springframework.stereotype.Service;

@Service
public class BasicWinnerService {
    int counter = 0;

    public char selectWinner(TicTacModel ticTacModel) {

        counter += 1;
        char winner = ' ';
        boolean haveWinner = false;
        String boardSymbols = ticTacModel.getBoardSymbols();
        int rowsNum = ticTacModel.getRows();
        int numberOfCells = (int) Math.pow(rowsNum, 2);
        int initialCondition = 0;
        int finalCondition = 0;
        int scope = 0;
int text= 0;

        if (!haveWinner) {
            for (int i = 0; i < numberOfCells; i++) {
                char toCheck = boardSymbols.charAt(i);
                if ((boardSymbols.charAt(i) != ' ') && i < rowsNum) {  //Horizontal
                    initialCondition = i + rowsNum;
                    finalCondition = numberOfCells;
                    scope = rowsNum;
                    text=1;
                } else if ((boardSymbols.charAt(i) != ' ') && (boardSymbols.length() % (boardSymbols.length() - i)) == 0) { //vertical
                    initialCondition = i + 1;
                    finalCondition = i + (rowsNum - 1);
                    scope = 1;
                    text = 2;
                } else if (boardSymbols.charAt(0) != ' ') {  //cross left right
                    initialCondition = rowsNum + 1;
                    finalCondition = numberOfCells + 1;
                    scope = rowsNum + 1;
                    text = 3;
                } else if (boardSymbols.charAt(rowsNum - 1) != ' ') { //cross right left
                    initialCondition = (rowsNum - 1);
                    finalCondition = (numberOfCells + 1) - rowsNum;
                    scope = rowsNum - 1;
                    text = 4;
                }
                for (int j = initialCondition; j < finalCondition; j += scope) {
                    if (boardSymbols.charAt(j) != toCheck) {
                        haveWinner = false;
                        break;
                    } else {
                        winner = toCheck;
                        haveWinner = true;
                    }
                }
                if (haveWinner){break;}

            }
            if (!haveWinner && counter == 9) {
                winner = 'D';
            }
        }

        System.out.println(counter);
        System.out.println(haveWinner);
        System.out.println(text);
        return winner;
    }
}

