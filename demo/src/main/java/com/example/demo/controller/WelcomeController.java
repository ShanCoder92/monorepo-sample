package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public String sayWelcome() {
        return "Welcome to the demo";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/welcome")
    public String sayWelcomeV2() {
        return "Welcome to the v2 demo";
    }


}
