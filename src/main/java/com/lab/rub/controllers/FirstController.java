package com.lab.rub.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable int id) {
        return "Hello " + id;
    }

    @GetMapping("/about")
    public String about() {
        return "about us";
    }

    @GetMapping("/options")
    public String options() {
        return "not an option";
    }

    @GetMapping("/options/{any}")
    public String options(@PathVariable String any) {
        return "options";
    }
}
