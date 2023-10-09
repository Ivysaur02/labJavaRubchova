package com.lab.rub.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PetHistoryDTO {
    private int id;
    private String pet_history_message;
    private PetForAnyDTO pet;
}
