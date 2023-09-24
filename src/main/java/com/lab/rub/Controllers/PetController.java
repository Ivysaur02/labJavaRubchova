package com.lab.rub.Controllers;


import com.lab.rub.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
public class PetController {


    @Autowired
    PetService petService;


    @GetMapping("pet")
    public String getPet(){
        return petService.getAllPet();
    }

}
