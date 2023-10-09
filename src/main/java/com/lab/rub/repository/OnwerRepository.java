package com.lab.rub.repository;

import com.lab.rub.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnwerRepository extends JpaRepository<Owner, Integer> {
}
