package com.example.ticTacToeWeb;

import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import com.example.ticTacToeWeb.service.BasicWinnerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

    private BasicWinnerService winnerService;

    @Before
    public void setup() {
        winnerService = new BasicWinnerService();
    }

    //actual.action = expected
    @Test
    public void Test1() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("XXXXXXXXX").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void Test2() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("OOOOOOOOO").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }


    //Horizontal tests
    @Test
    public void TestH1() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("XXX      ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestH2() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("   XXX   ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestH3() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("      XXX").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestH4() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("OOO      ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestH5() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("   OOO   ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestH6() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("      OOO").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }


    //Horizontal tests
    @Test
    public void TestV1() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("X  X  X  ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestV2() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols(" X  X  X ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestV3() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("  X  X  X").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void TestV4() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("O  O  O  ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestV5() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols(" O  O  O ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestV6() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("  O  O  O").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestC1() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("O   O   O").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void TestC2() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("  O O O  ").build();

        Assert.assertEquals('O', winnerService.selectWinner(model));
    }

    @Test
    public void Test4x4() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("XXXX            ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }

    @Test
    public void Tes22t() {
        TicTacModel model = TicTacModel.create().cols(3).rows(3).boardSymbols("X   X   X   X   ").build();

        Assert.assertEquals('X', winnerService.selectWinner(model));
    }
}
