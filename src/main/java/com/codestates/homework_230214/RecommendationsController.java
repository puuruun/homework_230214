package com.codestates.homework_230214;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
