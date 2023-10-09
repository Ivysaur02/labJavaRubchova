package com.lab.rub.Controllers;

import com.lab.rub.DTO.OwnerDTO;
import com.lab.rub.Entity.Doctor;
import com.lab.rub.Entity.Owner;
import com.lab.rub.Service.OwnerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public String showOwner(Model model){
        List<Owner> find = ownerService.getAllOwner();
        List<OwnerDTO> ownerDTO = find.stream()
                .map(owner -> modelMapper.map(owner, OwnerDTO.class))
                .toList();
        model.addAttribute("owner", ownerDTO);
        return "owner";
    }
}
