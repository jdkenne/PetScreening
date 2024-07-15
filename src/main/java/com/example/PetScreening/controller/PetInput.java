package com.example.PetScreening.controller;

import com.example.PetScreening.classes.Pet;
import com.example.PetScreening.classes.PetOwner;

public class PetInput {

    private Long id;
    private String name;
    private int weight;
    private String breed;
    private String vax;
    private int trainingLvl;
    private PetOwner owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVax() {
        return vax;
    }

    public void setVax(String vax) {
        this.vax = vax;
    }

    public int getTrainingLvl() {
        return trainingLvl;
    }

    public void setTrainingLvl(int trainingLvl) {
        this.trainingLvl = trainingLvl;
    }

    public PetOwner getOwner() {
        return owner;
    }

    public void setOwner(PetOwner owner) {
        this.owner = owner;
    }

    public Pet getPetEntity() {
        Pet pet = new Pet();
        pet.setName(this.name);
        pet.setWeight(this.weight);
        pet.setBreed(this.breed);
        pet.setVax(this.vax);
        pet.setTrainingLvl(this.trainingLvl);
        pet.setOwner(this.owner);
        return pet;
    }
}
