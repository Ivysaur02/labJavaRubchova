package com.lab.rub.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctor")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    String name;

    @OneToMany(mappedBy = "doctor")
    List<Pet> pets= new ArrayList<>();;

    @Override
    public String toString(){
        return "Доктор "+ name;
    }
}
