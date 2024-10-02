package com.ski.ski.Controller;


import com.ski.ski.Service.PisteService;
import com.ski.ski.entity.Color;
import com.ski.ski.entity.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pistes")
public class PisteController {


    private final PisteService pisteService;


    @Autowired
    public PisteController(PisteService pisteService) {
        this.pisteService = pisteService; // Constructor injection
    }

    @PostMapping
    public Piste createPiste(@RequestParam String namePiste,
                             @RequestParam Color color,
                             @RequestParam int length,
                             @RequestParam int slope) {
        return pisteService.createPiste(namePiste, color, length, slope);
    }

    @GetMapping
    public List<Piste> getAllPistes() {
        return pisteService.getAllPistes();
    }
}
