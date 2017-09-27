package com.example.ticTacToeWeb.enums;

public enum TicTacEnum {
    X("X"), O("O");

    private String ticToeSymbols;

    @Override
    public String toString() {
        return "TicTacEnum{" +
                "ticToeSymbols='" + ticToeSymbols + '\'' +
                '}';
    }

    TicTacEnum(String ticToeSymbols) {
        this.ticToeSymbols = ticToeSymbols;
    }

    public String getTicToeSymbols() {
        return ticToeSymbols;
    }
}
