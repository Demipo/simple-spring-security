package com.example.simplespringsecurity.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
public class HelloController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "<h1>Hello there!</h1>";
    }
}
