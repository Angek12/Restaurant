package com.restaurant.service;

import com.restaurant.model.Utensil;
import com.restaurant.repository.UtensilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UtensilService {
    
    @Autowired
    private UtensilRepository utensilRepository;
    
    public List<Utensil> getAllUtensils() {
        return utensilRepository.findAll();
    }
    
    public Optional<Utensil> getUtensilById(Long id) {
        return utensilRepository.findById(id);
    }
    
    public Utensil saveUtensil(Utensil utensil) {
        return utensilRepository.save(utensil);
    }
    
    public void deleteUtensil(Long id) {
        utensilRepository.deleteById(id);
    }
}
