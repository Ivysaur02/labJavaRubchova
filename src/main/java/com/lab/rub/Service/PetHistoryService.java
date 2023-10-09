package com.lab.rub.Service;


import com.lab.rub.Entity.PetHistory;
import com.lab.rub.repository.PetHistoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetHistoryService {
    @Autowired
    PetHistoryRepository petRepository;

    public List<PetHistory> getAllPetHistory(){
        return petRepository.findAll();
    }
}
