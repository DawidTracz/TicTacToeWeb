package com.example.ticTacToeWeb.ticTacModel;

import com.example.ticTacToeWeb.interfaces.Buildable;

public class TicTacBoard {

    private String boardSymbols;
    private int rows;
    private int cols;



    public String getBoardSymbols() {
        return boardSymbols;
    }

    public int getRows() {
        return rows;
    }



    public static TicTacBuilder create() {
        return new TicTacBuilder();
    }

    public static class TicTacBuilder implements Buildable<TicTacBoard> {


        private TicTacBoard ticTacBoard = new TicTacBoard();




        public TicTacBuilder rows(int rows) {
            ticTacBoard.rows = rows;
            // this = instancja siebie samego
            return this;
        }

        public TicTacBuilder cols(int cols) {
            ticTacBoard.cols = cols;
            return this;
        }

        public TicTacBuilder boardSymbols(String boardSymbols) {
            ticTacBoard.boardSymbols = boardSymbols;
            return this;
        }

        @Override
        public TicTacBoard build() {
            return ticTacBoard;
        }
    }
}

