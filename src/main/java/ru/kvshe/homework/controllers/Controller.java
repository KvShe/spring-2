package ru.kvshe.homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String homePage() {
        return "Welcome to the Home Page!";
    }
}
