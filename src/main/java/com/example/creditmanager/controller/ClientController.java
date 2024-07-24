package com.example.creditmanager.controller;

import com.example.creditmanager.model.Client;
import com.example.creditmanager.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String listClients(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "clientList"; // JSP page name
    }
}
