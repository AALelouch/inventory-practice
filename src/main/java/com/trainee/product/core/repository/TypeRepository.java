package com.trainee.product.core.repository;

import com.trainee.product.core.entity.Category;
import com.trainee.product.core.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Optional<Type> findByName(String name);
}
