package com.lab.rub.Controllers;


import com.lab.rub.DTO.PetHistoryDTO;
import com.lab.rub.Entity.PetHistory;
import com.lab.rub.Service.PetHistoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hist")
public class PetHistController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    PetHistoryService petHistoryService;

    @GetMapping
    public String showPetHistory(Model model){
        List<PetHistory> find = petHistoryService.getAllPetHistory();
        List<PetHistoryDTO> history = find.stream()
                .map(petHistory -> modelMapper.map(petHistory, PetHistoryDTO.class))
                .toList();
        model.addAttribute("history", history);
        return "pet-history";
    }
}
