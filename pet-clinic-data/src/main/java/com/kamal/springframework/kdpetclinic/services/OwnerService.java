package com.kamal.springframework.kdpetclinic.services;

import com.kamal.springframework.kdpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();

}
