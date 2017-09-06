package com.example.ticTacToeWeb.logic;


import com.example.ticTacToeWeb.ticTacModel.TicTacModel;


public interface WinnerSelector {

   char selectWinner(TicTacModel ticTacModel);


}
