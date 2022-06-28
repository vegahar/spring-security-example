package com.example.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredTestController {

    @GetMapping("sikkert")
    public String test() {
        return "hello world secured";
    }
}
