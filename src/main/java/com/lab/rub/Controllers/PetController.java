package com.lab.rub.Controllers;


import com.lab.rub.DTO.PetDTO;
import com.lab.rub.Entity.Pet;
import com.lab.rub.Service.PetService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PetController {


    @Autowired
    PetService petService;
    @Autowired
    ModelMapper modelMapper;


    @GetMapping("/pet")
    public String showPets(Model model) {
        List<Pet> pets = petService.getAllPet();
        List<PetDTO> petDtoList = pets.stream().
                map(pet -> modelMapper.map(pet, PetDTO.class)).
                toList();
        model.addAttribute("pets", petDtoList);
        return "pet-list";
    }

}
