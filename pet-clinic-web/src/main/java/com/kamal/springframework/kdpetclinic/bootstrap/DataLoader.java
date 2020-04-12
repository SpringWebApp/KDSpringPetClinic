package com.kamal.springframework.kdpetclinic.bootstrap;

import com.kamal.springframework.kdpetclinic.model.Owner;
import com.kamal.springframework.kdpetclinic.model.Vet;
import com.kamal.springframework.kdpetclinic.services.OwnerService;
import com.kamal.springframework.kdpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Kamaldwip");
        owner1.setLastName("Choudhury");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kishore");
        owner2.setLastName("Choudhury");

        ownerService.save(owner2);

        System.out.println("Loading Owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Tuhin");
        vet1.setLastName("Deb");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Pallabi");
        vet2.setLastName("Deb");

        vetService.save(vet2);

        System.out.println("Loading vets....");



    }
}
