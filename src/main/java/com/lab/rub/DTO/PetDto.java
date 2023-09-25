package com.lab.rub.DTO;


import com.lab.rub.Entity.Owner;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PetDto {

    String name;

    String PetHistory;

    List<Owner> ownerList;

    String Doctor;
}
