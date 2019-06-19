package com.handup.handupserver.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String index() {
        return "Greetings from the Greeting controller!";
    }

}