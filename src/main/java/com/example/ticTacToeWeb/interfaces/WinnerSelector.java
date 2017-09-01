package com.example.ticTacToeWeb.interfaces;

import com.example.ticTacToeWeb.Model.ModelBoard;
import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import com.example.ticTacToeWeb.enums.WinnerEnum;

public interface WinnerSelector {

    WinnerEnum selectWinner(ModelBoard modelBoard, TicTacModel ticTacModel);



}
