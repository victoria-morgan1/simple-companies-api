package com.vicky.companies;

public class Company {

    private final long id;
    private final String companyNumber;
    private final String companyName;

    public Company(long id, String companyNumber, String companyName) {
        this.id = id;
        this.companyNumber = companyNumber;
        this.companyName = companyName;
    }


    public long getId() {
        return id;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }
}
