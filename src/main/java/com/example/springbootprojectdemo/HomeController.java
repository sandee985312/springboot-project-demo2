package com.example.springbootprojectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
     @GetMapping ("/hee")
    public String hello()
    {
        return "hello world";
    }
}
