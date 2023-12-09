package com.lazarev.springweb.controller;

import com.lazarev.springweb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    private User user;

    @GetMapping("/hello") //localhost:8080/hello?mode=dark&count=2
    public String getHelloMessage(@RequestParam(required = false) String username,
                                  @RequestParam(required = false) String password){
        return "hello";
    }

    @GetMapping("/model")
    public String getModel(@RequestParam String username, Model model){
        model.addAttribute("user", username);
        return "welcome";
    }

    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model){
        this.user = user;
        return "redirect:/register";
    }
}
