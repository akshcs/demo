package com.example.deploy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello/")
public class DemoController {

    @GetMapping("")
    String home() {
        return "Hello Folks Welcome to Demo Prod Deploy";
    }
}
