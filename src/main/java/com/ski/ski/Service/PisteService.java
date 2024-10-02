package com.ski.ski.Service;



import com.ski.ski.Repository.PisteRepository;
import com.ski.ski.entity.Color;
import com.ski.ski.entity.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteService {

    @Autowired
    private PisteRepository pisteRepository;

    public Piste createPiste(String namePiste, Color color, int length, int slope) {
        Piste piste = new Piste();
        piste.setNamePiste(namePiste);
        piste.setColor(color);
        piste.setLength(length);
        piste.setSlope(slope);
        return pisteRepository.save(piste);
    }

    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }
}

