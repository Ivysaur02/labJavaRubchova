package com.lab.rub.Service;


import com.lab.rub.Entity.Doctor;
import com.lab.rub.Entity.Pet;
import com.lab.rub.repository.DoctorRepository;
import com.lab.rub.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PetRepository petRepository;

    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    public void saveDoctor(String name, int petId) {
        Optional<Pet> petEntity = petRepository.findById(petId);
        Doctor doctor = new Doctor();
        petEntity.ifPresent(pet -> doctor.getPets().add(pet)); // добаввляем но это в базу не заносится не нужно переделать
        doctor.setName(name);
        doctorRepository.save(doctor);
    }
}
