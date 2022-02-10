package com.vicky.companies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompaniesController {

    @GetMapping("/companies")
    public Company getComapny(){
        System.out.println("Processing Get Company REST request");
        return new Company(1l, "SC1006", "MyHaggis LTY");
    }
}
