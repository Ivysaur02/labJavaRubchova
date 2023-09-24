package com.lab.rub.repository;

import com.lab.rub.Entity.PetHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetHistoryRepository extends CrudRepository<PetHistory, Integer> {
}
