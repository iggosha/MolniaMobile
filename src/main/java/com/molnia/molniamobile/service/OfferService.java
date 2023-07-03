package com.molnia.molniamobile.service;

import com.molnia.molniamobile.model.Offer;
import com.molnia.molniamobile.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> findAll() {
        return offerRepository.findAll();
    }

    public Offer findById(int id) {
        return offerRepository.findById(id).orElse(null);
    }

    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }
}