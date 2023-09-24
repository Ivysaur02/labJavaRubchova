package com.lab.rub.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "doctor")
@Getter
@Setter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    String name;

    @OneToMany(mappedBy = "doctor")
    List<Pet> pets;

    @Override
    public String toString(){
        return "Доктор "+ name;
    }
}
