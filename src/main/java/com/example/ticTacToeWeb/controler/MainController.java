package com.example.ticTacToeWeb.controler;


import com.example.ticTacToeWeb.service.GameService;
import com.example.ticTacToeWeb.ticTacModel.TicTacBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String sendWinningString(@RequestBody TicTacBoard ticTacModel) {
        String response = gameService.basicWinnerSelectorCall(ticTacModel);



        System.out.println(response);
        return response;
    }
}


