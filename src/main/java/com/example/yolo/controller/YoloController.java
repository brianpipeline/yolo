package com.example.yolo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class YoloController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Version 0.1.0. WOOOOOO";
    }
}
