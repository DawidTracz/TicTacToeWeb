package com.example.ticTacToeWeb.controler;

import com.example.ticTacToeWeb.Model.ModelBoard;
import com.example.ticTacToeWeb.TicTacModel.TicTacModel;
import com.example.ticTacToeWeb.service.BasicWinnerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
    public String sendWinningString(@RequestBody TicTacModel ticTacModel) {

        BasicWinnerService basicWinnerService = new BasicWinnerService();
        basicWinnerService.selectWinner(ticTacModel);




        return null;
    }
}


