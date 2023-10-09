package com.lab.rub.Controllers;


import com.lab.rub.DTO.DoctorDTO;
import com.lab.rub.DTO.PetForAnyDTO;
import com.lab.rub.Entity.Doctor;
import com.lab.rub.Entity.Pet;
import com.lab.rub.Service.DoctorService;
import com.lab.rub.Service.PetService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @Autowired
    PetService petService;

    @Autowired
    ModelMapper modelMapper;


    @GetMapping
    public String showDoctors(Model model) {
        List<Doctor> doctors = doctorService.getAllDoctor();
        List<DoctorDTO> doctorDTOs = doctors.stream()
                .map(doctor -> modelMapper.map(doctor, DoctorDTO.class))
                .toList();
        List<Pet> pets = petService.getAllPet();
        List<PetForAnyDTO> petDTOs = pets.stream()
                .map(pet -> modelMapper.map(pet, PetForAnyDTO.class))
                .toList();
        model.addAttribute("doctors", doctorDTOs);
        model.addAttribute("pets", petDTOs);
        return "doctor";
    }

    @PostMapping
    public String createDoctor(@RequestParam String name,
                               @RequestParam Integer petId) {
        doctorService.saveDoctor(name, petId);
        return "redirect:/doctor";
    }

}
