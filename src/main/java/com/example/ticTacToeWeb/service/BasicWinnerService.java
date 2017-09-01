package com.example.ticTacToeWeb.service;

import com.example.ticTacToeWeb.Model.ModelBoard;
import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import com.example.ticTacToeWeb.enums.WinnerEnum;
import com.example.ticTacToeWeb.interfaces.WinnerSelector;
import org.springframework.stereotype.Service;

@Service
public class BasicWinnerService {

    public String selectWinner(TicTacModel ticTacModel) {
        char winner = ' ';
        boolean haveWinner = false;
        String judgeString = ticTacModel.getResultString();
        int rowsOrCols = ticTacModel.getRows();
        int numberOfCells = (int) Math.pow(rowsOrCols, 2);
        System.out.println(judgeString);

        for (int i = 0; i < numberOfCells; i += rowsOrCols) {
            char toCheck = judgeString.charAt(i);

            for (int j = i + 1; j < i + (rowsOrCols - 1); j++) {
                if (judgeString.charAt(j) != toCheck) {
                    haveWinner = false;
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;

                }
                System.out.println("dupa");
            }

        }
            if (haveWinner) {
                System.out.println("winner is1 " + winner);

            }
        if (!haveWinner) {
            for (int i = 0; i <= rowsOrCols; i++) {
                char toCheck = judgeString.charAt(i);
                for (int j = i + rowsOrCols+1; j < numberOfCells; j += rowsOrCols) {
                    if (judgeString.charAt(j) != toCheck) {
                        haveWinner = false;
                        break;
                    } else {
                        winner = toCheck;
                        haveWinner = true;


                    }

                }
                if (haveWinner) {
                    System.out.println("winner is2 " + winner);
                    break;
                }

            }

        }
        if (!haveWinner) {
            for (int i = 0; i <= numberOfCells; i += rowsOrCols + 1) {
                char toCheck = judgeString.charAt(0);
                if (judgeString.charAt(i) != toCheck) {
                    haveWinner = false;
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;
                    System.out.println("winner is 3" + winner);

                }

            }
        }
        if (!haveWinner) {
            for (int i = rowsOrCols - 1; i <= numberOfCells - (rowsOrCols); i += rowsOrCols - 1) {
                char toCheck = judgeString.charAt(rowsOrCols - 1);
                if (judgeString.charAt(i) != toCheck) {
                    haveWinner = false;
                    break;
                } else {
                    winner = toCheck;
                    haveWinner = true;
                    System.out.println("winner is 4" + winner);
                }
            }
        }
        if (!haveWinner) {
            winner = 'D';
            System.out.println("winner is 5" + winner);
        }

        return "winner is 6" + winner;
    }
}

