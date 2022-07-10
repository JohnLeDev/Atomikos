package com.example.atomikosDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class  AtomikosController{

    @GetMapping(value="path")
    public String getWelcome() {
        return "hello otomikos";
    }

    
    
}