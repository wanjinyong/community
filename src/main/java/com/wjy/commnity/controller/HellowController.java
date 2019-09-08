package com.wjy.commnity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowController {
    @GetMapping("/")
    public  String index(){
        return "index";
    }
}
