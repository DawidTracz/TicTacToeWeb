package com.example.ticTacToeWeb;

import com.example.ticTacToeWeb.ticTacModel.TicTacBoard;
import com.example.ticTacToeWeb.logic.BasicWinnerSelector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

    private BasicWinnerSelector winnerService;

    @Before
    public void setup() {
        winnerService = new BasicWinnerSelector();
    }

    //actual.action = expected
    @Test
    public void selectWinner_should_select_X_when_all_symbols_equals_X() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("XXXXXXXXX").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_equals_O() {

        TicTacBoard model = TicTacBoard.create().rows(3).cols(3).boardSymbols("OOOOOOOOO").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }


    //Horizontal tests
    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_first_row_equals_X() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("XXX      ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_second_row_equals_X() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("   XXX   ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_third_row_equals_X()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("      XXX").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_first_row_equals_O()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("OOO      ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_second_row_equals_O() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("   OOO   ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_third_row_equals_O() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("      OOO").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }


    //Horizontal tests
    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_first_column_equals_X() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("X  X  X  ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_second_column_equals_X() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols(" X  X  X ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_third_column_equals_X()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("  X  X  X").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_first_column_equals_O()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("O  O  O  ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_second_column_equals_O()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols(" O  O  O ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_in_third_column_equals_O()  {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("  O  O  O").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_diagonal_equals_O_from_left_to_right() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("O   O   O").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_O_when_all_symbols_diagonal_equals_O_from_right_to_left() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("  O O O  ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_D_when_symbols_represent_DRAW() {
        TicTacBoard model = TicTacBoard.create().cols(3).rows(3).boardSymbols("XOXXOOOXX").build();

        Assert.assertEquals('D', winnerService.selectWinner(model));
    }


    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_first_row_equals_X_when_board_size_equals_4X4()  {
        TicTacBoard model = TicTacBoard.create().cols(4).rows(4).boardSymbols("XXXX            ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_in_first_column_equals_X_when_board_size_equals_4X4() {
        TicTacBoard model = TicTacBoard.create().cols(4).rows(4).boardSymbols("X   X   X   X   ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void selectWinner_should_select_X_when_all_symbols_diagonal_X_from_left_to_right_when_board_size_equals_4X4() {
        TicTacBoard model = TicTacBoard.create().cols(4).rows(4).boardSymbols("X    X    X    X").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }
}
