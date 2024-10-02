package com.ski.ski.Controller;

import com.ski.ski.Service.SkierService;
import com.ski.ski.entity.Registration;
import com.ski.ski.entity.Skier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skiers")
public class SkierController {

    private final SkierService skierService;

    @Autowired
    public SkierController(SkierService skierService) {
        this.skierService = skierService;
    }

    @PostMapping("/create")
    public Skier createSkier(@RequestParam String firstName, @RequestBody List<Registration> registrations) {
        return skierService.createSkierWithRegistrations(firstName, registrations);
    }

    @GetMapping("/all")
    public List<Skier> getAllSkiers() {
        return skierService.getAllSkiers();
    }
}
