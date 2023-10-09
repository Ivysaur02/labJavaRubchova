package com.lab.rub.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DoctorDTO {
    private int id;
    private String name;
    private List<PetForAnyDTO> pets;
}
