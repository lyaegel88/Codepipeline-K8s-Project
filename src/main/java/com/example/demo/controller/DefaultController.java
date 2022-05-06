package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping(path = {"","/"})
    public String getHello(){
        return "Hello World!";
    }

    @GetMapping("/luke")
    public String getLuke(){
        return "Hey, this is Luke!";
    }

    @GetMapping("/chandler")
    public String getChandler(){
        return "Hey, this is Luke's son, Chandler!";
    }

    @GetMapping("/anna")
    public String getAnna(){
        return "Hey, this is Luke's wife, Anna!";
    }

    @GetMapping("/brandon")
    public String getBrandon(){
        return "Hey, this is Luke's best friend, Brandon!";
    }
}
