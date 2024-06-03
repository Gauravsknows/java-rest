package com.gaurav.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String message(){
        return "Welcome to Spring Boot";
    }

    @GetMapping("/hello-world")
    public String helloworldmessage(){
        return "Hello World. I am alka lama";
    }
}
