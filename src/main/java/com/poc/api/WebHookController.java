package com.poc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Webhook")
public class WebHookController {

    @GetMapping("/response")
    public String getResponse(){
        return "Hello Dear :) How are you ?";
    }
}
