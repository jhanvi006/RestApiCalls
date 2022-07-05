package com.example.restapidemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @GetMapping("/home")
    public String displayMessage(){
        return "Hello from Bridgelabz";
    }
    @GetMapping("/query")
    @ResponseBody
    public String displayMessage(@RequestParam String name){
        return "Hello "+name+"!";
    }
}
