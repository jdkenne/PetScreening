package com.example.PetScreening.controller;

import com.example.PetScreening.classes.PetOwner;

public class OwnerInput {

    private String name;
    private Long id;
    private PetInput pets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetOwner getPetOwnerEntity() {
        PetOwner owner = new PetOwner();
        owner.setName(this.name);
        return owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PetInput getPets() {
        return pets;
    }

    public void setPets(PetInput pets) {
        this.pets = pets;
    }

    public static class PetInput {

        private int weight;
        private String vax;
        private int trainingLvl;
        private String breed;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
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

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }
    }
}
