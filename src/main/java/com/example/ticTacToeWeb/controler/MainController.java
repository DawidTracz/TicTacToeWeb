package com.example.ticTacToeWeb.controler;

import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String sendWinningString(@RequestBody final TicTacModel ticTacModel) {
        int counter = 0;
        counter += 1;
        String judgeString = ticTacModel.getWinner();
        System.out.println("String = " + judgeString);
        System.out.println(counter);
        if ((judgeString.charAt(0) == 'X' && judgeString.charAt(1) == 'X' && judgeString.charAt(2) == 'X') ||
                (judgeString.charAt(3) == 'X' && judgeString.charAt(4) == 'X' && judgeString.charAt(5) == 'X') ||
                (judgeString.charAt(6) == 'X' && judgeString.charAt(7) == 'X' && judgeString.charAt(8) == 'X') ||
                (judgeString.charAt(0) == 'X' && judgeString.charAt(3) == 'X' && judgeString.charAt(6) == 'X') ||
                (judgeString.charAt(1) == 'X' && judgeString.charAt(4) == 'X' && judgeString.charAt(7) == 'X') ||
                (judgeString.charAt(2) == 'X' && judgeString.charAt(5) == 'X' && judgeString.charAt(8) == 'X') ||
                (judgeString.charAt(0) == 'X' && judgeString.charAt(4) == 'X' && judgeString.charAt(8) == 'X') ||
                (judgeString.charAt(2) == 'X' && judgeString.charAt(4) == 'X' && judgeString.charAt(6) == 'X')) {
            System.out.println("X WON");
        } else if (
                (judgeString.charAt(0) == 'O' && judgeString.charAt(1) == 'O' && judgeString.charAt(2) == 'O') ||
                        (judgeString.charAt(3) == 'O' && judgeString.charAt(4) == 'O' && judgeString.charAt(5) == 'O') ||
                        (judgeString.charAt(6) == 'O' && judgeString.charAt(7) == 'O' && judgeString.charAt(8) == 'O') ||
                        (judgeString.charAt(0) == 'O' && judgeString.charAt(3) == 'O' && judgeString.charAt(6) == 'O') ||
                        (judgeString.charAt(1) == 'O' && judgeString.charAt(4) == 'O' && judgeString.charAt(7) == 'O') ||
                        (judgeString.charAt(2) == 'O' && judgeString.charAt(5) == 'O' && judgeString.charAt(8) == 'O') ||
                        (judgeString.charAt(0) == 'O' && judgeString.charAt(4) == 'O' && judgeString.charAt(8) == 'O') ||
                        (judgeString.charAt(2) == 'O' && judgeString.charAt(4) == 'O' && judgeString.charAt(6) == 'O')) {
            System.out.println("0 WON");
        } else if (!judgeString.contains(" ")){
            System.out.println("Draw");

        }
        return null;
    }
}


