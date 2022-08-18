package com.trainee.product.core.repository;

import com.trainee.product.core.entity.Category;
import com.trainee.product.core.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaxRepository extends JpaRepository<Tax, Long> {
    Optional<Tax> findByName(String name);
}
