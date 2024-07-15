package com.example.PetScreening.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PetScreening.classes.PetOwner;

@Repository
public interface OwnerRepository extends JpaRepository<PetOwner, Long> {

    PetOwner findByName(String name);

}
