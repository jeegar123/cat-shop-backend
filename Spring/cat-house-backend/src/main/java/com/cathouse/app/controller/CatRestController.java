package com.cathouse.app.controller;

import com.cathouse.app.model.Cats;
import com.cathouse.app.repo.CatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/cats")
public class CatRestController {

    private final CatRepository catRepository;

    public CatRestController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping
    public List<Cats> getAllCats() {
        return catRepository.findAll();
    }

    @GetMapping("/{id}")
    public Object getCatById(@PathVariable int id) {
        Optional<Cats> optional = catRepository.findById(id);
        return optional.orElse(null);
    }

    @GetMapping("/search/findbybreed/breed={breed}")
    public List<Cats> getCatsListByBreed(@PathVariable String breed) {
        return catRepository.findByCatBreedContains(breed);
    }
}
