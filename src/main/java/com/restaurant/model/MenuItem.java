package com.restaurant.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    private String description;

    @Positive(message = "Price must be positive")
    private BigDecimal price;

    private String category;
    private String imageUrl;
    private boolean available = true;
    private String preparationTime;
    private String ingredients;
    private String nutritionalInfo;
    private boolean vegetarian;
    private boolean spicy;

    @Column(name = "cooking_instructions", length = 1000)
    private String cookingInstructions;

    // For AI recommendations
    private int popularityScore;
    private String tags;
}
