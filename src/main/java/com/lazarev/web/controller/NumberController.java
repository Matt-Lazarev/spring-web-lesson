package com.lazarev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumberController {
    private static String[] array = {"first", "second", "third"};

    @ResponseBody
    @GetMapping("/number")  //localhost:8080/number
    public String getNumberMessage() {
        return String.valueOf(100);
    }

    @ResponseBody
    @GetMapping("/array/{index}") //localhost:8080/array/0
    public String getIndex(@PathVariable Integer index) {
        return array[index];
    }
}
