package com.lab.rub.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    String name;

    @Column(columnDefinition = "text")
    String adres;


    @ManyToMany(mappedBy = "owners")
    List<Pet> pets;
}
