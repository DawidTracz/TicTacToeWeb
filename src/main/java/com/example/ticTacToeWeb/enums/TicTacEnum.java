package com.example.ticTacToeWeb.enums;

public enum TicTacEnum {
    X("X"), O("O");

    private String  ticToeSymbols;
    TicTacEnum(String ticToeSymbols) {this.ticToeSymbols = ticToeSymbols;}
    public String getTicToeSymbols() {return ticToeSymbols;}
}
