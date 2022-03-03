package com.vicky.companies;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompaniesService {
    public Company getComapany(long id){
        return new Company(id, "SC1006", "MyHaggis LTY");
    }

    public List<Company> getCompanies(){
        Company one = new Company(1l, "SC1006", "MyHaggis LTY");
        Company two = new Company (2l, "SC1010", "Hairdressers");
        List <Company> companies = new ArrayList<Company>();
        companies.add(one);
        companies.add(two);

        return companies;
    }

    public Company createCompany(NewCompany newCompany){
        Company company = new Company (newCompany);
        
        return company;
    }


    public Company updateCompany(long companyId, NewCompany newCompany){
        Company company = new Company (companyId, newCompany.getCompanyNumber(), newCompany.getCompanyName());

        return company;
    }
}
