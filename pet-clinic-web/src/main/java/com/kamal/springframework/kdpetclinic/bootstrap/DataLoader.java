package com.kamal.springframework.kdpetclinic.bootstrap;

import com.kamal.springframework.kdpetclinic.model.Owner;
import com.kamal.springframework.kdpetclinic.model.Vet;
import com.kamal.springframework.kdpetclinic.services.OwnerService;
import com.kamal.springframework.kdpetclinic.services.VetService;
import com.kamal.springframework.kdpetclinic.services.map.OwnerServiceMap;
import com.kamal.springframework.kdpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Kamaldwip");
        owner1.setLastName("Choudhury");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kishore");
        owner2.setLastName("Choudhury");

        System.out.println("Loading Owners.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Tuhin");
        vet1.setLastName("Deb");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Pallabi");
        vet2.setLastName("Deb");

        System.out.println("Loading vets....");



    }
}
