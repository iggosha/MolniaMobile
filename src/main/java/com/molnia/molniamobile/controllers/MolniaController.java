package com.molnia.molniamobile.controllers;

import com.molnia.molniamobile.model.News;
import com.molnia.molniamobile.model.Tariff;
import com.molnia.molniamobile.service.TariffService;
import com.molnia.molniamobile.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MolniaController {

    private TariffService tariffService;
    private NewsService newsService;

    public MolniaController(TariffService tariffService, NewsService newsService) {
        this.tariffService = tariffService;
        this.newsService = newsService;
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
    public String getNewsPage(Model model) {
        List<News> news = newsService.findAll();
        model.addAttribute("news", news);
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
