package com.example.PetScreening.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PetScreening.classes.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    Pet findByBreedNot(String breed);

    Pet findByWeightLessThan(int weight);

    Pet findPetByVax(String vax);

    Pet findPetByTrainingLvl(int trainingLvl);

}
