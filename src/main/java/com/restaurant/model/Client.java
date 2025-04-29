package com.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String phone;
    
    @Column(name = "last_visit")
    private LocalDateTime lastVisit;
    
    @Column(name = "total_visits")
    private Integer totalVisits;
    
    private String preferences;
}
