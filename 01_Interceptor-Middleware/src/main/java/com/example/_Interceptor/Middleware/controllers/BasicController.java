package com.example._Interceptor.Middleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@RestController
@RequestMapping(path = "/time")
public class BasicController {

    @GetMapping("")
    public LocalDateTime currentDateTime(){
        return LocalDateTime.now();
    }

}
