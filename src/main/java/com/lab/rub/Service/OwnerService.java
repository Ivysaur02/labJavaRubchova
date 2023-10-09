package com.lab.rub.Service;


import com.lab.rub.Entity.Owner;
import com.lab.rub.repository.OnwerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    @Autowired
    OnwerRepository onwerRepository;

    public List<Owner> getAllOwner(){
        return onwerRepository.findAll();
    }
}
