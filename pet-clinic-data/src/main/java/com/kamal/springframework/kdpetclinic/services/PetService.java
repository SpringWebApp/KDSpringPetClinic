package com.kamal.springframework.kdpetclinic.services;

import com.kamal.springframework.kdpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
