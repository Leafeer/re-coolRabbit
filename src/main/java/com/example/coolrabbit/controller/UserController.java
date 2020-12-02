package com.example.coolrabbit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/")
    public String login() {
        return "hello";
    }

    @GetMapping(path = "/register")
    public String register() {
        return "hello";
    }
}
