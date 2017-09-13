package com.example.ticTacToeWeb.ticTacModel;

import com.example.ticTacToeWeb.interfaces.Buildable;

import java.util.ResourceBundle;

public class Result {

    private String winner;
    private boolean isFinished;
    private boolean hasWinner;


    public String getWinner() {return winner;}

    public boolean isFinished() {
        return isFinished;
    }

    public boolean hasWinner() {
        return hasWinner;
    }

    @Override
    public String toString() {
        return "Result{" +
                "winner='" + winner + '\'' +
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

            resultObject.winner =result;

            return this;
        }



        @Override

        public Result build() { return resultObject;}

        public ResultBuilder hasWinner(boolean b) {
            resultObject.hasWinner = b;
            return this;
        }

        public ResultBuilder isFinished(boolean isFinished)
        {
        resultObject.isFinished = isFinished;
            return this;
        }
    }
}



