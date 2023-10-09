package com.lab.rub.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class OwnerDTO {
    private int id;
    private String name;
    private String adres;
    private List<PetForAnyDTO> pets;
}
