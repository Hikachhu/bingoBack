package com.project.bingo.controller;

import com.project.bingo.model.Person;
import com.project.bingo.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository userRepository;

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    public Person createUser(@RequestBody @Valid Person user) {
        return userRepository.save(user);
    }

    @GetMapping
    @CrossOrigin
    public List<Person> getAllUsers() {
        return userRepository.findAll();
    }
}
