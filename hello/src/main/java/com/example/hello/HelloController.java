package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Rukiye") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/yuksel")
    public String getWellSoon(@RequestParam(value = "name", defaultValue = "Yüksel") String name) {
        return String.format("Get Well Soon %s!", name);
    }
}
