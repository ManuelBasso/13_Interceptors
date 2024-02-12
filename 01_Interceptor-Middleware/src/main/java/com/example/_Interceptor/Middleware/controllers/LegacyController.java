package com.example._Interceptor.Middleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/legacy")
public class LegacyController {

    @GetMapping("")
    public String message() {
        return "This is just old code";
    }
}
