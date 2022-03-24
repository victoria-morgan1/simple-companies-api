package com.vicky.companies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompaniesService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompaniesService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getComapany(String id){
        return companyRepository.findById(id).get();
    }

    public List<Company> getCompanies(){
        return companyRepository.findAll();
    }

    public Company createCompany(NewCompany newCompany){
        Company company = new Company (newCompany);
        companyRepository.save(company);
        return company;
    }


    public Company updateCompany(String companyId, NewCompany newCompany){
        Company company = new Company (companyId, newCompany.getCompanyNumber(), newCompany.getCompanyName());
        companyRepository.save(company);
        return company;
    }

    public void deleteCompany(String companyId){
        companyRepository.deleteById(companyId);
    }

}
