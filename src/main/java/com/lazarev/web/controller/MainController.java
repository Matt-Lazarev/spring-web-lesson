package com.lazarev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //MVC -> M - model   V - view (html)  C - controller
    @GetMapping("/hello")  //localhost:8080/hello
    public String getHelloPage(Model model) {
        //load from db
        model.addAttribute("name", "Matvey");
        return "hello-page"; //html + css
    }
}
