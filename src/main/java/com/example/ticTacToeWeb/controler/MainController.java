package com.example.ticTacToeWeb.controler;

import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createAccount(@RequestBody final TicTacModel ticTacModel) {
        System.out.println("String = " + ticTacModel.getWinner());

        return null;
    }
}


