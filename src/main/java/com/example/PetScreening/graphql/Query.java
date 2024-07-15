package com.example.PetScreening.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.PetScreening.classes.Pet;
import com.example.PetScreening.repository.OwnerRepository;
import com.example.PetScreening.repository.PetRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

    private final PetRepository petRepository;
    public final OwnerRepository ownerRepository;

    @Autowired
    public Query(PetRepository petRepository, OwnerRepository ownerRepository) {
        this.petRepository = petRepository;
        this.ownerRepository = ownerRepository;
    }

    public Iterable<Pet> findByWeightLessThan(int weight) {
        return petRepository.findByWeightLessThan(weight);
    }

    public Iterable<Pet> findByBreedNot(String breed) {
        return petRepository.findByBreedNot(breed);
    }

    public Iterable<Pet> findPetByVax(String vax) {
        return petRepository.findPetByVax(vax);
    }

    public Iterable<Pet> findPetByTrainingLvl(int trainingLvl) {
        return petRepository.findPetByTrainingLvl(trainingLvl);
    }
}
