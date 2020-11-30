package com.example.linkedin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {
    @GetMapping("/")
    public String sampleDemo(){
        return "hello";
    }
}
