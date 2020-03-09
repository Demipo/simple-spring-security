package com.example.simplespringsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "<h1>Hello there</h1>";
    }

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public String admin(){
        return "<h1>Hello admin</h1>";
    }
}
