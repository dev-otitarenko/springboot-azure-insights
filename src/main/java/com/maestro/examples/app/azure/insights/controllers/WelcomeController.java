package com.maestro.examples.app.azure.insights.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final static Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping(value = "/")
    public String welcome (){
        log.info("welcomeController");
        return "Welcome from Spring Boot app";
    }
}
