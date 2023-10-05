package com.lab.rub.DTO;

import com.lab.rub.DTO.DoctorDTO;
import com.lab.rub.DTO.OwnerDTO;
import com.lab.rub.DTO.PetHistoryDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PetDTO {
    private int id;
    private String name;
    private PetHistoryDTO petHistory;
    private List<OwnerDTO> owners;
    private DoctorDTO doctor;

}
