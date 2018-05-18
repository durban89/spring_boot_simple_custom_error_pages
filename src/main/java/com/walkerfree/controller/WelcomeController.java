package com.walkerfree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
    @RequestMapping("welcome/index")
    public String index(Model model) {
        model.addAttribute("title", "index");
        return "welcome/index";
    }
}
