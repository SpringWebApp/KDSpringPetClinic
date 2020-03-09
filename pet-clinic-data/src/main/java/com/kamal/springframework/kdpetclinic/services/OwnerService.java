package com.kamal.springframework.kdpetclinic.services;

import com.kamal.springframework.kdpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
