package com.example.PetScreening.graphql;

import com.example.PetScreening.repository.PetRepository;
import com.example.PetScreening.repository.OwnerRepository;
import graphql.kickstart.tools.GraphQLResolver;

import com.example.PetScreening.classes.Pet;
import com.example.PetScreening.classes.PetOwner;
import com.example.PetScreening.controller.PetInput;
import com.example.PetScreening.controller.OwnerInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("rawtypes")
@Component
public class Mutation<Owner> implements GraphQLResolver {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    public PetOwner addOwner(OwnerInput input) {
        try {
            PetOwner owner = new PetOwner();
            PetOwner existingOwner = ownerRepository.findByName(owner.getName());
            if (existingOwner != null) {
                return ownerRepository.save(existingOwner);
            } else {
                PetOwner newOwner = new PetOwner();
                newOwner.setName(input.getName());
                newOwner.setId(input.getId());
                return ownerRepository.save(newOwner);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to add owner: " + e.getMessage());
        }
    }

    public Pet addPet(PetInput input) {
        try {
            Pet pet = new Pet();
            pet.setName(input.getName());
            pet.setWeight(input.getWeight());
            pet.setBreed(input.getBreed());
            pet.setVax(input.getVax());
            pet.setTrainingLvl(input.getTrainingLvl());
            pet.setOwner(input.getOwner());

            return petRepository.save(pet);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add pet: " + e.getMessage());
        }
    }
}
