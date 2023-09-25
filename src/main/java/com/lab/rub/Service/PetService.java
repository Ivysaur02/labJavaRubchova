package com.lab.rub.Service;


import com.lab.rub.DTO.OwnerDto;
import com.lab.rub.DTO.PetDto;
import com.lab.rub.Entity.Pet;
import com.lab.rub.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;


    public List<PetDto> getAllPet() {
        List<Pet> pets = petRepository.findAll();
        List<PetDto> list = new ArrayList<>();
        for (Pet pet : pets) {
            PetDto petDto = PetDto.builder()
                    .name(pet.getName())
                    .PetHistory(pet.getPetHistory().getPet_history_message())
                    .ownerList(pet.getOwners())
                    .Doctor(pet.getDoctor().getName())
                    .build();
            list.add(petDto);
        }
        return list;
    }
}
