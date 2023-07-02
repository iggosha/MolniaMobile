package com.molnia.molniamobile.controllers;

import com.molnia.molniamobile.model.Tariff;
import com.molnia.molniamobile.service.TariffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MolniaController {

    private TariffService tariffService;

    public MolniaController(TariffService tariffService) {
        this.tariffService = tariffService;
    }

    @GetMapping
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/tariffs")
    public String getTariffsPage(Model model) {
        List<Tariff> tariffs = tariffService.findAll();
        model.addAttribute("tariffs", tariffs);
        return "tariffs";
    }

    @GetMapping("/services")
    public String getServicesPage() {
        return "services";
    }
    @GetMapping("/news")
    public String getNewsPage() {
        return "news";
    }
    @GetMapping("/contacts")
    public String getContactsPage() {
        return "contacts";
    }
    @GetMapping("/account")
    public String getAccountPage() {
        return "account";
    }
}
