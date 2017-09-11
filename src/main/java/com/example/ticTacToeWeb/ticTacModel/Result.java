package com.example.ticTacToeWeb.ticTacModel;

public class Result {

    public Result resultModel = new Result();

    public Result getResult() {
        return resultModel;
    }


    public static Builder create() {
        return new Builder();
    }


    public static class Builder {

        private Result resultModel = new Result();


        public Result build() {
            return resultModel;
        }

    }
}



