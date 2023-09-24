package com.lab.rub.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    String name;

    @OneToOne
    @JoinColumn(name = "pet_history_id")
    PetHistory petHistory;

    @ManyToMany
    @JoinTable(name = "pets_owners",
            joinColumns = @JoinColumn(name = "owner_id"),
            inverseJoinColumns = @JoinColumn(name = "pet_id")
    )
    List<Owner> owners;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    Doctor doctor;

}
