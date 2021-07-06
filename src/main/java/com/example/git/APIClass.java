package com.example.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class APIClass {

    @GetMapping
    public String get() {
        return "hello";
    }

    @GetMapping("/world")
    public String getWorld() {
        return "hello world";
    }
}
