package com.lab.rub.Service;


import com.lab.rub.Entity.Pet;
import com.lab.rub.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;


    public String getAllPet(){
        return petRepository.findAll().toString();
    }
}
