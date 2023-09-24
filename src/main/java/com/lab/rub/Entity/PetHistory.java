package com.lab.rub.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pet_history")
@Getter
@Setter
public class PetHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "text")
    String pet_history_message;

    @OneToOne(mappedBy = "petHistory")
    Pet pet;


    @Override
    public String toString(){
        return "Хозяин "+ pet_history_message;
    }
}
