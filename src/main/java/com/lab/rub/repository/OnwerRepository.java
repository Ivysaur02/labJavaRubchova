package com.lab.rub.repository;

import com.lab.rub.Entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnwerRepository extends CrudRepository<Owner, Integer> {
}
