package com.example.ticTacToeWeb.service;


import com.example.ticTacToeWeb.enums.TicTacEnum;
import com.example.ticTacToeWeb.logic.BasicWinnerSelector;
import com.example.ticTacToeWeb.ticTacModel.TicTacModel;
import org.springframework.stereotype.Service;


@Service
public class GameService {


   public String basicWinnerSelectorCall(TicTacModel ticTacModel) {

       BasicWinnerSelector basicWinnerSelector = new BasicWinnerSelector();
       return basicWinnerSelector.selectWinner(ticTacModel);
   }
}
