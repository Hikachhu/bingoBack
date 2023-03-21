package com.project.bingo.controller;


import com.project.bingo.model.GrilleBingo;
import com.project.bingo.repository.GrilleRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grille")
public class GrilleController {

    @Autowired
    private GrilleRepository grilleRepository;

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    public GrilleBingo createGenre(@RequestBody @Valid GrilleBingo genre) {
        return grilleRepository.save(genre);
    }

    @GetMapping
    @CrossOrigin
    public List<GrilleBingo> getAllGenres() {
        return grilleRepository.findAll();
    }
}
