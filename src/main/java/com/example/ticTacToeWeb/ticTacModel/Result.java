package com.example.ticTacToeWeb.ticTacModel;

import com.example.ticTacToeWeb.interfaces.Buildable;

import java.util.ResourceBundle;

public class Result {
    private String winSymbol;
    private boolean isFinished;
    private boolean hasWinner;

    public String getWinSymbol() {
        return winSymbol;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public boolean isWinner() {
        return hasWinner;
    }

    @Override
    public String toString() {
        return "Result{" +
                "winner='" + winSymbol + '\'' +
                ", isFinished=" + isFinished +
                ", hasWinner=" + hasWinner +
                '}';
    }

    public static ResultBuilder create() {
        return new ResultBuilder();
    }

    public static class ResultBuilder implements Buildable<Result> {
        private Result resultObject = new Result();

        public ResultBuilder result(String result) {
            resultObject.winSymbol = result;
            return this;
        }

        @Override
        public Result build() {
            return resultObject;
        }

        public ResultBuilder winner(String winner) {
            resultObject.winSymbol = winner;
            return this;
        }

        public ResultBuilder hasWinner(boolean hasWinner) {
            resultObject.hasWinner = hasWinner;
            return this;
        }

        public ResultBuilder isFinished(boolean isFinished) {
            resultObject.isFinished = isFinished;
            return this;
        }
    }
}



