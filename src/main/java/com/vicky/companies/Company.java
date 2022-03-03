package com.vicky.companies;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class Company {

    private static final AtomicLong sequenceNumber = new AtomicLong(1);
    private  long id;
    private  String companyNumber;
    private  String companyName;
    private LocalDateTime creationDateTime;

    public Company (){

    }

    public Company(NewCompany newCompany) {
        this.id = sequenceNumber.getAndIncrement();
        this.companyNumber = newCompany.getCompanyNumber();
        this.companyName = newCompany.getCompanyName();
        this.creationDateTime = LocalDateTime.now();

    }

    public Company(long id, String companyNumber, String companyName) {
        this.id = id;
        this.companyNumber = companyNumber;
        this.companyName = companyName;
        this.creationDateTime = LocalDateTime.now();
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

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
