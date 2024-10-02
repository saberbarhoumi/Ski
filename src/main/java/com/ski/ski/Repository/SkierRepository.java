package com.ski.ski.Repository;

import com.ski.ski.entity.Skier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkierRepository extends JpaRepository<Skier, Long> {
    // Additional query methods can be defined here if needed
}
