package com.vicky.companies;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompaniesController {

    @GetMapping("/company/{id}")
    public Company getComapny(@PathVariable long id){
        System.out.println("Processing Get Company REST request");
        return new Company(id, "SC1006", "MyHaggis LTY");
    }

    @GetMapping("/companies")
    public List<Company> getCompanies(){
        System.out.println("Processing Get Companies REST request");
        Company one = new Company(1l, "SC1006", "MyHaggis LTY");
        Company two = new Company (2l, "SC1010", "Hairdressers");
        List <Company> companies = new ArrayList<Company>();
        companies.add(one);
        companies.add(two);

        return companies;
    }

    @PostMapping("/create-company")
    @ResponseStatus(HttpStatus.CREATED)
    public Company createCompany(@RequestBody Company company){
        System.out.println("Processing Post request to create Company");
        return company;
    }
}
