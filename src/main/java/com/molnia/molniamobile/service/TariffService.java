package com.molnia.molniamobile.service;

import com.molnia.molniamobile.model.Tariff;
import com.molnia.molniamobile.repository.TariffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffService {

    private TariffRepository tariffRepository;

    public TariffService(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }

    public List<Tariff> findAll(){
        return tariffRepository.findAll();
    }

    public  Tariff findById(int id){
        return tariffRepository.findById(id).orElse(null);
    }
}
