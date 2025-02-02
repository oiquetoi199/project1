package com.project1.myproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {
    @GetMapping("/")
    public String index() {
        return "Hello world 3";
    } 
    
    @GetMapping("/user")
    public String userPage() {
        return "user page";
    } 

    @GetMapping("/admin")
    public String adminPage() {
        return "admin page";
    } 
}
