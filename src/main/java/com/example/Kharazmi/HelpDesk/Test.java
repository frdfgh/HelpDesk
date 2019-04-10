package com.example.Kharazmi.HelpDesk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorld {
    @GetMapping("/time")

    public String HelloWorld (){
        String hw = "Hello World !";
        return hw;

    }
}
