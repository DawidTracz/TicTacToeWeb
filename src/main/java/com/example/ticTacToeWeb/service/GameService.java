package com.example.ticTacToeWeb.service;


import com.example.ticTacToeWeb.logic.BasicWinnerSelector;
import com.example.ticTacToeWeb.ticTacModel.TicTacModel;
import org.springframework.stereotype.Service;


@Service
public class GameService {


   public void  basicWinnerSelectorCall() {

       BasicWinnerSelector basicWinnerSelector = new BasicWinnerSelector();
       basicWinnerSelector.selectWinner(TicTacModel.create().build());
       
   }





}
