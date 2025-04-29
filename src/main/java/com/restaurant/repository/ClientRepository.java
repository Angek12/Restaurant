package com.restaurant.repository;

import com.restaurant.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // Add custom query methods if needed
}
