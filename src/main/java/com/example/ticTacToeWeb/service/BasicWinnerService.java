package com.example.ticTacToeWeb.service;

import com.example.ticTacToeWeb.Model.ModelBoard;
import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import com.example.ticTacToeWeb.enums.WinnerEnum;
import com.example.ticTacToeWeb.interfaces.WinnerSelector;

public class BasicWinnerService {

    public String selectWinner(ModelBoard modelBoard, TicTacModel ticTacModel) {
        char winner = ' ';
        boolean haveWinner = false;
        String judgeString = ticTacModel.getResultString();
        int board = modelBoard.getmodelBoard();
        int numberOfCells = (int) Math.pow(board, 2);


        for (int i = 0; i < numberOfCells; i += board) {
            char toCheck = judgeString.charAt(i);

            for (int j = i + 1; j < i + (board - 1); j++) {

                if (judgeString.charAt(j) != toCheck) {
                    haveWinner = false;
                    break;

                } else {
                    winner = toCheck;
                    haveWinner = true;
                }

            }

            if (haveWinner == true) {

                break;
            } else continue;
        }
        if (haveWinner = false) {
            for (int i = 0; i <= board; i++) {
                char toCheck = judgeString.charAt(i);
                for (int j = i + board; j <= numberOfCells; j += board) {
                    if (judgeString.charAt(j) != toCheck) {
                        haveWinner = false;
                        break;
                    } else {
                        winner = toCheck;
                        haveWinner = true;
                    }

                }
                if (haveWinner != true) {
                    continue;
                } else {
                    break;
                }
            }

        }

        if (haveWinner = false) {

            for (int i = 0; i <= numberOfCells; i += board + 1) {
                char toCheck = judgeString.charAt(0);
                if (judgeString.charAt(i) != toCheck) {
                    haveWinner = false;
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;
                }

            }
        }
        if (haveWinner = false) {
            for (int i = board - 1; i <= numberOfCells - (board); i += board - 1) {
                char toCheck = judgeString.charAt(board - 1);

                if (judgeString.charAt(i) != toCheck) {
                    haveWinner = false;
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;
                }

            }
        }
        if (haveWinner = false) {
            winner = 'D';
        }
        
        return "winner is" + winner;
    }
}

