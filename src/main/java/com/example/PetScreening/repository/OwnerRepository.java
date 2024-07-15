package com.example.PetScreening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetScreening.classes.PetOwner;

public interface OwnerRepository extends JpaRepository<PetOwner, Long> {
    
}
