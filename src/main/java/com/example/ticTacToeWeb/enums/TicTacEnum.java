package com.example.ticTacToeWeb.enums;

public enum TicTacEnum {
    X('X'), O('O');

    private char ticToeSymbols;

    TicTacEnum(char ticToeSymbols) {
        this.ticToeSymbols = ticToeSymbols;
    }

    public char getTicToeSymbols() {
        return ticToeSymbols;
    }
}
