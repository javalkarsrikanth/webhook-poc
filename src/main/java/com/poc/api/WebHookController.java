package com.poc.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebHookController {

    @GetMapping("/response")
    public String getResponse(){
        return "Hello Dear :) How are you :D";
    }

    @GetMapping("/location")
    public String getLocation(){
        return "The Republic of India.";
    }
}
