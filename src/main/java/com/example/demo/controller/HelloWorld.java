package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author happy
 * @since 2021/4/20 23:24:34
 */
@RestController
public class HelloWorld {

    @GetMapping("hello")
    public String sayHi() {
        return "hello world!";
    }
}
