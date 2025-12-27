package com.afzaalahmadzeeshan.demos.java.spring_k6_load.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.afzaalahmadzeeshan.demos.java.spring_k6_load.models.Person;
import com.afzaalahmadzeeshan.demos.java.spring_k6_load.repositories.PeopleRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("add")
    public boolean addPeople(@RequestBody Person person) {
        peopleRepository.save(person);
        return true;
    }
}
