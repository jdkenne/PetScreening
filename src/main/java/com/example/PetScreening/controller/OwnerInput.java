package com.example.PetScreening.controller;

import com.example.PetScreening.classes.PetOwner;

public class OwnerInput {

    private String name;

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
}
