package com.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "utensils")
public class Utensil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String category;
    private Integer quantity;
    private String condition;
    private String location;
    
    @Column(name = "last_maintenance")
    private String lastMaintenance;
}
