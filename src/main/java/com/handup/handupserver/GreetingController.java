package com.handup.handupserver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String index() {
        return "Greetings from the Greeting controller!";
    }

}