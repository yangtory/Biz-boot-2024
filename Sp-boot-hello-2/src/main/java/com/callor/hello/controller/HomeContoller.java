package com.callor.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @GetMapping(value = {"/"})
    public String home(){
        return "안녕하세요";
    }
}
