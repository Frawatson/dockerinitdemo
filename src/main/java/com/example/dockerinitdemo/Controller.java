package com.example.dockerinitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello(){
        return "Congratulations, you've deploy a java application using docker init";
    }
}
