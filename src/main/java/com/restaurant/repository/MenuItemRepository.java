package com.restaurant.repository;

import com.restaurant.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByCategory(String category);
    List<MenuItem> findByAvailableTrue();
    List<MenuItem> findByVegetarianTrue();
    List<MenuItem> findBySpicyTrue();
    
    @Query("SELECT m FROM MenuItem m WHERE " +
           "LOWER(m.name) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(m.description) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(m.category) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(m.tags) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<MenuItem> searchMenuItems(String query);
    
    @Query("SELECT m FROM MenuItem m ORDER BY m.popularityScore DESC")
    List<MenuItem> findTopPopularItems();
}
