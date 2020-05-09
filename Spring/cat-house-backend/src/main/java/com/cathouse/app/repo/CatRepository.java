package com.cathouse.app.repo;

import com.cathouse.app.model.Cats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CatRepository extends JpaRepository<Cats, Integer> {

    List<Cats> findByCatBreedContains(String breed);
}
