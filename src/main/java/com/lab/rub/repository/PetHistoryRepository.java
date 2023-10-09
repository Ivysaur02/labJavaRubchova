package com.lab.rub.repository;

import com.lab.rub.Entity.PetHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetHistoryRepository extends JpaRepository<PetHistory, Integer> {
}
