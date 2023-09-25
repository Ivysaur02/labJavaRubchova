package com.lab.rub.Controllers;


import com.lab.rub.DTO.PetDto;
import com.lab.rub.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {


    @Autowired
    PetService petService;


    @GetMapping("/pet")
    public String showPetList(Model model) {
        List<PetDto> pets = petService.getAllPet();
        model.addAttribute("pets", pets);
        return "pet-list";
    }

}
