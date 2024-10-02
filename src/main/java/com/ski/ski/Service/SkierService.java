package com.ski.ski.Service;

import com.ski.ski.Repository.SkierRepository;
import com.ski.ski.entity.Registration;
import com.ski.ski.entity.Skier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkierService {

    private final SkierRepository skierRepository;

    @Autowired
    public SkierService(SkierRepository skierRepository) {
        this.skierRepository = skierRepository; // Correction ici
    }

    public Skier createSkierWithRegistrations(String firstName, List<Registration> registrations) {
        Skier skier = new Skier();
        skier.setFirstName(firstName); // Correction ici
        for (Registration registration : registrations) {
            registration.setSkier(skier); // Définir le skieur dans chaque inscription
        }
        skier.setRegistrations(registrations); // Vous devez implémenter cette méthode dans Skier
        return skierRepository.save(skier);
    }

    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }
}
