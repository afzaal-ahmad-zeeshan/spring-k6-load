package com.afzaalahmadzeeshan.demos.java.spring_k6_load.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afzaalahmadzeeshan.demos.java.spring_k6_load.models.Person;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findAll();

    Person findByName(String name);

    Person findById(int id);
}
