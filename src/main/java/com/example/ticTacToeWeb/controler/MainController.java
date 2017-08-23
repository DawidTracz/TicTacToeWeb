package com.example.ticTacToeWeb.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class MainController {


    @GetMapping("/index")
    public String mainPage(Model model) {

        boolean a = true;


        if(a==true) {
            model.addAttribute("a", "Hello Thymeleaf");
        }


            return "index";
    }


}
