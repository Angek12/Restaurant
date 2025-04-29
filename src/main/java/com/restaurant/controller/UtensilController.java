package com.restaurant.controller;

import com.restaurant.model.Utensil;
import com.restaurant.service.UtensilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/utensils")
public class UtensilController {
    
    @Autowired
    private UtensilService utensilService;
    
    @GetMapping
    public String listUtensils(Model model) {
        model.addAttribute("utensils", utensilService.getAllUtensils());
        return "utensils/list";
    }
    
    @GetMapping("/new")
    public String newUtensilForm(Model model) {
        model.addAttribute("utensil", new Utensil());
        return "utensils/form";
    }
    
    @PostMapping
    public String saveUtensil(@ModelAttribute Utensil utensil) {
        utensilService.saveUtensil(utensil);
        return "redirect:/utensils";
    }
    
    @GetMapping("/edit/{id}")
    public String editUtensilForm(@PathVariable Long id, Model model) {
        model.addAttribute("utensil", utensilService.getUtensilById(id).orElseThrow());
        return "utensils/form";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUtensil(@PathVariable Long id) {
        utensilService.deleteUtensil(id);
        return "redirect:/utensils";
    }
}
