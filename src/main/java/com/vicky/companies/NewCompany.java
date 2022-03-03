package com.vicky.companies;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class NewCompany {
    @JsonProperty("company_name")
    private  String companyName;
    @JsonProperty("company_number")
    private String companyNumber;

    public NewCompany(){

    }

    public NewCompany(String companyName, String companyNumber) {
        this.companyName = companyName;
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyNumber() { return companyNumber;}


}
