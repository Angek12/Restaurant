package com.restaurant.repository;

import com.restaurant.model.Utensil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtensilRepository extends JpaRepository<Utensil, Long> {
    // Add custom query methods if needed
}
