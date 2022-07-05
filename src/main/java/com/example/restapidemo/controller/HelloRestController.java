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
    public String displayMessageWithQueryParam(@RequestParam String name){
        return "Hello "+name+"!";
    }
    @GetMapping("param/{name}")
    public String displayMessageWithPathVar(@PathVariable String name){
        return "Hello from "+name+"!";
    }
}
