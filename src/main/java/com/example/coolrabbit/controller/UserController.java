package com.example.coolrabbit.controller;

import com.example.coolrabbit.service.UserService;
import com.example.coolrabbit.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    public String login() {
        return "hello";
    }

    @PostMapping(path = "/register")
    public String register(@RequestBody RegisterVo registerVo) {
        return "hello";
    }
}
