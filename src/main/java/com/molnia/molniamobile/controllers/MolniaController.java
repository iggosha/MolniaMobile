package com.molnia.molniamobile.controllers;

import com.molnia.molniamobile.model.News;
import com.molnia.molniamobile.model.Offer;
import com.molnia.molniamobile.model.Tariff;
import com.molnia.molniamobile.service.OfferService;
import com.molnia.molniamobile.service.TariffService;
import com.molnia.molniamobile.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class MolniaController {

    private TariffService tariffService;
    private NewsService newsService;
    private OfferService offerService;

    public MolniaController(TariffService tariffService, NewsService newsService, OfferService offerService) {
        this.tariffService = tariffService;
        this.newsService = newsService;
        this.offerService = offerService;
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

    @GetMapping("/offers")
    public String getServicesPage(Model model) {
        List<Offer> offers = offerService.findAll();
        model.addAttribute("offers", offers);
        return "offers";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model) {
        List<News> news = newsService.findAll();
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/tariffs/{id}")
    public String currentTariff(@PathVariable("id") int id, Model model) {
        model.addAttribute("tariff", tariffService.findById(id));
        return "tariffitem";
    }

    @GetMapping("/offers/{id}")
    public String currentOffer(@PathVariable("id") int id, Model model) {
        model.addAttribute("offer", offerService.findById(id));
        return "offeritem";
    }

    @GetMapping("/news/{id}")
    public String currentNews(@PathVariable("id") int id, Model model) {
        model.addAttribute("news", newsService.findById(id));
        return "newsitem";
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
