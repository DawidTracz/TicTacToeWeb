package com.example.ticTacToeWeb.logic;

import com.example.ticTacToeWeb.ticTacModel.TicTacModel;

public interface Buildable {


    public static TicTacModel.Builder create(){


        return new TicTacModel.Builder();
    }

}
