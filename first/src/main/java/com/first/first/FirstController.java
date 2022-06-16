package com.first.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FirstController {
    @RequestMapping
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World!") String name) {
        return String.format("Hello %s!", name);
    }
}
