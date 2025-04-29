package com.restaurant.controller;

import com.restaurant.service.ClientService;
import com.restaurant.service.EmployeeService;
import com.restaurant.service.UtensilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private UtensilService utensilService;
    
    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // Add statistics to the model
        model.addAttribute("totalUtensils", utensilService.getAllUtensils().size());
        model.addAttribute("totalEmployees", employeeService.getAllEmployees().size());
        model.addAttribute("totalClients", clientService.getAllClients().size());
        
        return "dashboard";
    }
}
