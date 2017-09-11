package com.example.ticTacToeWeb.logic;


import com.example.ticTacToeWeb.ticTacModel.TicTacBoard;


public interface WinnerSelector {

   String selectWinner(TicTacBoard ticTacModel);


}
