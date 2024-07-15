package com.example.PetScreening.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.PetScreening.classes.Pet;
import com.example.PetScreening.classes.PetOwner;
import com.example.PetScreening.repository.OwnerRepository;
import com.example.PetScreening.repository.PetRepository;

@Controller
@Component
public class GraphQLController {

    @Autowired
    private final PetRepository petRepository;
    private final OwnerRepository ownerRepository;

    public GraphQLController(PetRepository petRepository, OwnerRepository ownerRepository) {
        this.petRepository = petRepository;
        this.ownerRepository = ownerRepository;
    }

    @QueryMapping
    public Iterable<Pet> findByBreedNot(String breed) {
        return this.petRepository.findByBreedNot(breed);
    }

    @QueryMapping
    public Iterable<Pet> findByWeightLessThan(int weight) {
        return petRepository.findByWeightLessThan(weight);
    }

    @QueryMapping
    public Iterable<Pet> findPetByTrainingLvl(int trainingLvl) {
        return this.petRepository.findPetByTrainingLvl(trainingLvl);
    }

    @QueryMapping
    public Iterable<Pet> findPetByVax(String vax) {
         return this.petRepository.findPetByVax(vax);
    }

    @MutationMapping
    public Pet addPet(@Argument(name = "input") PetInput petInput) {
        return this.petRepository.save(petInput.getPetEntity());
    }

    @MutationMapping
    public PetOwner addPetOwner(@Argument(name = "input") OwnerInput ownerInput) {
        return this.ownerRepository.save(ownerInput.getPetOwnerEntity());
    }

}
