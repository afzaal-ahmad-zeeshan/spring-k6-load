package com.afzaalahmadzeeshan.demos.java.spring_k6_load.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afzaalahmadzeeshan.demos.java.spring_k6_load.repositories.PeopleRepository;

@RestController
public class HomeController {
    private final PeopleRepository peopleRepository;

    public HomeController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    public String people() {
        var people = peopleRepository.findAll();
        return people.size() + " people found.";
    }
}
