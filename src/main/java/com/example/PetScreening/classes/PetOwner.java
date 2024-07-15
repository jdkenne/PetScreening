package com.example.PetScreening.classes;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Owners")
public class PetOwner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Pet pet;

    public PetOwner() {
    }

    public PetOwner(String name) {
        this.name = name;
    }

    // Getters and Setters
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

    public Pet getPets() {
        return pet;
    }

    public void setPets(Pet pet) {
        this.pet = pet;
    }

}
