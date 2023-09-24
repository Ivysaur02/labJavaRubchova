package com.lab.rub.repository;

import com.lab.rub.Entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
}
