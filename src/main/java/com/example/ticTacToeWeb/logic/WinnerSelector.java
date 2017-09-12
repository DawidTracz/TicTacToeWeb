package com.example.ticTacToeWeb.logic;


import com.example.ticTacToeWeb.ticTacModel.Result;
import com.example.ticTacToeWeb.ticTacModel.TicTacBoard;


public interface WinnerSelector {

   Result selectWinner(TicTacBoard ticTacModel);


}
