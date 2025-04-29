package com.restaurant.repository;

import com.restaurant.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Add custom query methods if needed
}
