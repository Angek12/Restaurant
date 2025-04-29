package com.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String position;
    private String email;
    private String phone;
    
    @Column(name = "hire_date")
    private LocalDate hireDate;
    
    private String status;
    private Double salary;
    
    @Column(name = "emergency_contact")
    private String emergencyContact;
}
