package com.example.PetScreening.classes;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Pets")
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "WEIGHT")
    private int weight;

    @Column(name = "BREED")
    private String breed;

    @Column(name = "VAX")
    private String vax;

    @Column(name = "TRAINING_LVL")
    private int trainingLvl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    private PetOwner owner;

    public Pet() {
    }

    public Pet(String name, int weight, String breed, String vax, int trainingLvl, PetOwner owner) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.vax = vax;
        this.trainingLvl = trainingLvl;
        this.owner = owner;
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

    public String getvax() {
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

    @Override
    public String toString() {
        return "Pet{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", weight=" + weight
                + ", breed='" + breed + '\''
                + ", vax='" + vax + '\''
                + ", trainingLvl=" + trainingLvl
                + ", owner=" + owner
                + '}';
    }
}
