package com.lab.rub.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pet_history")
public class PetHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(columnDefinition = "text")
    String pet_history_message;

    @OneToOne(mappedBy = "petHistory")
    Pet pet;
}
