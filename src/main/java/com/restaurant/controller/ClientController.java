package com.restaurant.controller;

import com.restaurant.model.Client;
import com.restaurant.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService clientService;
    
    @GetMapping
    public String listClients(Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "clients/list";
    }
    
    @GetMapping("/new")
    public String newClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "clients/form";
    }
    
    @PostMapping
    public String saveClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }
    
    @GetMapping("/edit/{id}")
    public String editClientForm(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id).orElseThrow());
        return "clients/form";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "redirect:/clients";
    }
}
