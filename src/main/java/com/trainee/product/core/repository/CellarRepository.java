package com.trainee.product.core.repository;

import com.trainee.product.core.entity.Category;
import com.trainee.product.core.entity.Cellar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CellarRepository extends JpaRepository<Cellar, Long> {
    Optional<Cellar> findByName(String name);
}
