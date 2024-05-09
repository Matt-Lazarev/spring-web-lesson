package com.lazarev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    //MVC - model view controller
    @GetMapping("/hello")
    public String getHelloPage(@RequestParam("firstname") String firstname,
                               @RequestParam(value = "lastname", required = false) String lastname,
                               Model model) {
        if(lastname != null){
            model.addAttribute("name", firstname + " " + lastname);
        }
        else {
            model.addAttribute("name", firstname);
        }
        return "hello-page";
    }
}
