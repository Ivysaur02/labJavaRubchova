package com.lab.rub;

import com.lab.rub.Entity.Pet;
import com.lab.rub.Entity.PetHistory;
import com.lab.rub.Service.PetService;
import com.lab.rub.repository.PetRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RubApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubApplication.class, args);
    }
}
