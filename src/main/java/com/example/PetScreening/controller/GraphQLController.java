package com.example.PetScreening.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.PetScreening.repository.PetRepository;
import com.example.PetScreening.repository.OwnerRepository;
import com.example.PetScreening.classes.Pet;
import com.example.PetScreening.classes.PetOwner;

@Controller
public class GraphQLController {

    private final PetRepository petRepository;
    private OwnerRepository OwnerRepository;

    public GraphQLController(PetRepository petRepository) {
        this.petRepository = petRepository;
        this.OwnerRepository = OwnerRepository;
    }

    @QueryMapping
    public Iterable<Pet> findPetByBreed() {
        return this.petRepository.findAll();
    }

    @QueryMapping
    public Iterable<Pet> findPetByWeight() {
        return this.petRepository.findAll();
    }

    @QueryMapping
    public Iterable<Pet> findPetByTrainingLvl() {
        return this.petRepository.findAll();
    }

    @QueryMapping
    public Iterable<Pet> findPetByVaccination() {
        return this.petRepository.findAll();
    }

    @MutationMapping
    public Pet addPet(@Argument(name = "input") PetInput petInput) {
        return this.petRepository.save(petInput.getPetEntity());
    }

    @MutationMapping
    public PetOwner addOwner(@Argument(name = "input") OwnerInput ownerInput) {
        return this.OwnerRepository.save(ownerInput.getPetOwnerEntity());
    }

}
