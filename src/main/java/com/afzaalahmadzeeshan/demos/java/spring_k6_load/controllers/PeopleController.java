package com.afzaalahmadzeeshan.demos.java.spring_k6_load.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.afzaalahmadzeeshan.demos.java.spring_k6_load.models.Person;
import com.afzaalahmadzeeshan.demos.java.spring_k6_load.repositories.PeopleRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController()
public class PeopleController {
    private final PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GetMapping("people")
    public List<Person> getAllPeople() {
        return peopleRepository.findAll();
    }

    @GetMapping("add")
    public boolean addPeople() {
        peopleRepository.save(new Person("John"));
        return true;
    }
}
