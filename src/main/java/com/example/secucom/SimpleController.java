package com.example.secucom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public  String publicPage(){
        return "Hello !";
    }

    @GetMapping("/private")
    public  String privatePage(){
        return "this page is private";
    }
}
