package com.lazarev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping("/hello")  //localhost:8080/hello
    public String getHelloMessage() {
        return "Hello!";
    }

    @ResponseBody
    @GetMapping("/number")  //localhost:8080/number
    public String getNumberMessage() {
        return String.valueOf(100);
    }
}
