package com.example.testyj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {

    @GetMapping("/home")
    public String test() {
        return "index.html";
    }
}
