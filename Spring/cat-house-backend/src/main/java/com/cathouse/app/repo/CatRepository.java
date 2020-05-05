package com.cathouse.app.repo;

import com.cathouse.app.model.Cats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository  extends JpaRepository<Cats,Integer> {
}
