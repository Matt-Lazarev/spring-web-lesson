package com.lazarev.web.controller;

import com.lazarev.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@Controller
public class FormController {
    private LinkedList<User> users = new LinkedList<>();

    @GetMapping("/form")
    public String getForm() {
        return "form";
    }

    @GetMapping("/form-handler")
    public String handleForm(@RequestParam String firstname,
                             @RequestParam String lastname,
                             @RequestParam String email,
                             Model model) {
        model.addAttribute("firstname", firstname);
        model.addAttribute("lastname", lastname);
        model.addAttribute("email", email);
        return "hello-user";
    }

    @GetMapping("/form-post")
    public String getFormPost(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/form-handler-post")
    public String handleFormPost(@ModelAttribute User user) {
        this.users.add(user); //save in DB
        System.out.println("Invoked /form-handler-post");
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        model.addAttribute("user", this.users.getLast());
        System.out.println("Invoked /result");
        return "hello-user";
    }

    @GetMapping("/table")
    public String getTable(Model model) {
        model.addAttribute("users", this.users);
        return "table";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", this.users.get(id));
        return "hello-user";
    }
}
