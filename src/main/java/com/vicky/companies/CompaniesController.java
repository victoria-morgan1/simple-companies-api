package com.vicky.companies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompaniesController {

    private CompaniesService companiesService;

    @Autowired
    public CompaniesController(CompaniesService companiesService){
        this.companiesService = companiesService;
    }
    @GetMapping("/companies/{id}")
    public Company getCompany(@PathVariable String id){
        System.out.println("Processing Get Company REST request");
        return companiesService.getComapany(id);

    }

    @GetMapping("/companies")
    public List<Company> getCompanies(){
        System.out.println("Processing Get Companies REST request");
        return companiesService.getCompanies();
    }

    @PostMapping("/create-company")
    @ResponseStatus(HttpStatus.CREATED)
    public Company createCompany(@RequestBody NewCompany newCompany){
        System.out.println("Processing Post request to create Company");
        return companiesService.createCompany(newCompany);
    }

    @PutMapping("/companies/{id}")
    Company updateCompany(@RequestBody NewCompany updatedCompany, @PathVariable("id") String companyId) {
        System.out.println("Processing update company create ID" +companyId);

        return companiesService.updateCompany(companyId, updatedCompany);
    }

    @DeleteMapping("/companies/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCompany(@PathVariable String id) {
        System.out.println("Processing Get Company REST request");
        companiesService.deleteCompany(id);
    }
}
