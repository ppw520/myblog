package com.ppw.myblog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @PostMapping("/login")
    public void login() {
        System.out.println("hello");
    }
}
