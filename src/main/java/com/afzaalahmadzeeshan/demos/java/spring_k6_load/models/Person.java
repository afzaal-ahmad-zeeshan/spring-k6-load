package com.afzaalahmadzeeshan.demos.java.spring_k6_load.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private int id;

    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }
}
