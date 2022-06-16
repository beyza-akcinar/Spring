package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("something","controller");
        model.addAttribute("people", Arrays.asList(
                new Person("A", 10),
                new Person("B", 22)
        ));
        return "template";
    }
}
