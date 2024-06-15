package com.udemi.springboot_rest_api_students.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // HTTP get Request
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!.";
    }
}
