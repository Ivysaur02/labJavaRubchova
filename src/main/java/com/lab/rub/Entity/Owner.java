package com.lab.rub.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "owner")
@Getter
@Setter
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

    @Override
    public String toString(){
        return "Хозяин "+ name;
    }
}
