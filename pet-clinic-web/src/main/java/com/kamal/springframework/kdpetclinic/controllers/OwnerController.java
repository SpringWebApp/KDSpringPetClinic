package com.kamal.springframework.kdpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String getListOfOwners(){
        return "owners/index";
    }

}
