package com.mockitotest.mockitotest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping
    public String helloWorld(){
        return  "Hello Tannu!";
    }

}
