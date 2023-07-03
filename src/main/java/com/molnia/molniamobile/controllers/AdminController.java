package com.molnia.molniamobile.controllers;

import com.molnia.molniamobile.model.News;
import com.molnia.molniamobile.model.Tariff;
import com.molnia.molniamobile.model.Offer;
import com.molnia.molniamobile.service.NewsService;
import com.molnia.molniamobile.service.OfferService;
import com.molnia.molniamobile.service.TariffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private TariffService tariffService;
    private NewsService newsService;
    private OfferService offerService;

    public AdminController(TariffService tariffService, NewsService newsService, OfferService offerService) {
        this.tariffService = tariffService;
        this.newsService = newsService;
        this.offerService = offerService;
    }

    @GetMapping("/admin")
    public String getAdminPage(@ModelAttribute("tariff") Tariff tariff, @ModelAttribute("offer") Offer offer,
                               @ModelAttribute("news") News news) {
        return "admin";
    }

    @PostMapping("/admin/addTariff")
    public String createTariff(@ModelAttribute("tariff") Tariff tariff) {
        tariffService.addTariff(tariff);
        return "redirect:/admin";
    }

    @PostMapping("/admin/addOffer")
    public String createOffer(@ModelAttribute("offer") Offer offer) {
        offerService.addOffer(offer);
        return "redirect:/admin";
    }

    @PostMapping("/admin/addNews")
    public String createNews(@ModelAttribute("news") News news) {
        newsService.addNews(news);
        return "redirect:/admin";
    }
}
