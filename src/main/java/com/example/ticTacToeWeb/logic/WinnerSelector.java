package com.example.ticTacToeWeb.logic;


import com.example.ticTacToeWeb.ticTacModel.TicTacModel;


public interface WinnerSelector {

   String selectWinner(TicTacModel ticTacModel);


}
