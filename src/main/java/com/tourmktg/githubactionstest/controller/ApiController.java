package com.tourmktg.githubactionstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String Hello(){
        return "hello spring boot!";
    }
}