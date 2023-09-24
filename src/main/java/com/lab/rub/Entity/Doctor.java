package com.lab.rub.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    String name;

    @OneToMany(mappedBy = "doctor")
    List<Pet> pets;
}
