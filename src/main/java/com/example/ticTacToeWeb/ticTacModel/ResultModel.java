package com.example.ticTacToeWeb.ticTacModel;

public class ResultModel {

    public ResultModel result = new ResultModel();

    public static TicTacModel.Builder create() {
        return new TicTacModel.Builder();
    }

    public ResultModel build() {
        return result;
    }
}


