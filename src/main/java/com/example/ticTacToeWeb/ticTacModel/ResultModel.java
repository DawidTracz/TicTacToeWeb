package com.example.ticTacToeWeb.ticTacModel;

public class ResultModel {

    public ResultModel resultModel = new ResultModel();

    public ResultModel getResult() {
        return resultModel;
    }


    public static Builder create() {
        return new Builder();
    }


    public static class Builder {

        private ResultModel resultModel = new ResultModel();


        public ResultModel build() {
            return resultModel;
        }

    }
}



