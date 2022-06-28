package com.example.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }

    @GetMapping("test/22")
    public String tests() {
        return "hello world from 2";
    }
}
