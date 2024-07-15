package com.example.PetScreening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PetScreening.classes.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Pet findPetByBreed(String breed);

    Pet findPetByWeight(int weight);

    Pet findPetByVax(String vax);

    Pet findPetByTrainingLvl(int trainingLvl);
    

}
