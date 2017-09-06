package com.example.ticTacToeWeb.ticTacModel;

public class TicTacModel {

    private String boardSymbols;
    private int rows;
    private int cols;

    public String getBoardSymbols() {
        return boardSymbols;
    }

    public int getRows() {
        return rows;
    }

    public static Builder create(){

        return new Builder();
    }

    public static class Builder {

        private TicTacModel ticTacModel = new TicTacModel();

        public Builder rows(int rows) {
            ticTacModel.rows = rows;
            // this = instancja siebie samego
            return this;
        }

        public Builder cols(int cols) {
            ticTacModel.cols = cols;
            return this;
        }

        public Builder boardSymbols(String boardSymbols) {
            ticTacModel.boardSymbols = boardSymbols;
            return this;
        }

        public TicTacModel build() {
            return ticTacModel;
        }
    }
}
