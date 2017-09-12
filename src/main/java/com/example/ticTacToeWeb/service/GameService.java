package com.example.ticTacToeWeb.service;


import com.example.ticTacToeWeb.logic.BasicWinnerSelector;
import com.example.ticTacToeWeb.ticTacModel.Result;
import com.example.ticTacToeWeb.ticTacModel.TicTacBoard;
import org.springframework.stereotype.Service;


@Service
public class GameService {


   public Result basicWinnerSelectorCall(TicTacBoard ticTacModel) {

       BasicWinnerSelector basicWinnerSelector = new BasicWinnerSelector();
       return basicWinnerSelector.selectWinner(ticTacModel);
   }
}
