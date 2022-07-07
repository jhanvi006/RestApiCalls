package com.example.restapidemo.controller;

import com.example.restapidemo.model.User;
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
    @PostMapping("/post")
    public String displayUsingPostMapping(@RequestBody User user){
        return user.getFirstName()+" "+user.getLastName();
    }
    @PutMapping("/put/{firstName}/")
    public String displayUsingPutMapping(@RequestParam String lastName, @PathVariable String firstName){
        return "Hello "+firstName+" "+lastName+"!";
    }
}
