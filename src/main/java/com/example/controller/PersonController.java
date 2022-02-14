package com.example.controller;

import com.example.entity.Car;
import com.example.entity.Person;
import com.example.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonMapper mapper;

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id) {
        Person person = mapper.getPersonById(id);
        return person;
    }

    @GetMapping("/all")
    public List<Person> getAllPerson() {
        return mapper.getAllPerson();
    }

    @GetMapping("/car/{id}")
    public Car getAllPerson(@PathVariable Long id) {
        return mapper.getCarById(id);
    }
}
