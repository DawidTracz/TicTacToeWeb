package com.example.ticTacToeWeb.enums;

public enum WinnerEnum {
    X("Winner_1"), O("Winner_2"), D("Draw");

    private String winnerSymbol;


    WinnerEnum(String winnerSymbol){
        this.winnerSymbol = winnerSymbol;
    }

    public String getWinnerSymbol(){
        return winnerSymbol;
    }
}
