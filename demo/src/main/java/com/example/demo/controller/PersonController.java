package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.repo.PersonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    private PersonRepo personRepo;

    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping("/people")
    public List<Person> findAll() {
        return  personRepo.findAll();
    }

    @GetMapping("/hello")
    public String hello() {
        String hello=personRepo.findAll().get(0).getName();
        return "Hello, "+hello +"!";
    }
}
