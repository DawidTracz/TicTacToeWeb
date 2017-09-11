package com.example.ticTacToeWeb.ticTacModel;

import com.example.ticTacToeWeb.interfaces.Buildable;

public class Result {

    public Result result = new Result();


    public Result getResult() {

        return result;
    }


    public static ResultBuilder create() {
        return new ResultBuilder();
    }


    public static class ResultBuilder implements Buildable<Result> {

        private Result result = new Result();

        public ResultBuilder result() {

            Result.result = result;
            return this;

        }


        @Override

        public Result build() {


            return result;
        }

    }
}



