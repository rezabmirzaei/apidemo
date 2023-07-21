package com.reza.apidemo.apidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiDemoController {

    @GetMapping(value = "/user-profile", produces = "application/json")
    public String getUserProfile() {
        return "{ \"name\": \"John Doe\", \"age\": 30 }";
    }

    @GetMapping(value = "/latest-info", produces = "application/json")
    public String getLatestInfo() {
        return "{ \"message\": \"Latest info here\" }";
    }
}
