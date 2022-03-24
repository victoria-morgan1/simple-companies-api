package com.vicky.companies;

import org.springframework.data.annotation.Id;

import javax.persistence.GenerationType;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class Company {

    @Id
    private  String id;
    private  String companyNumber;
    private  String companyName;
    private LocalDateTime creationDateTime;

    public Company (){

    }

    public Company(NewCompany newCompany) {
        this.id = UUID.randomUUID().toString();
        this.companyNumber = newCompany.getCompanyNumber();
        this.companyName = newCompany.getCompanyName();
        this.creationDateTime = LocalDateTime.now();

    }

    public Company(String id, String companyNumber, String companyName) {
        this.id = id;
        this.companyNumber = companyNumber;
        this.companyName = companyName;
        this.creationDateTime = LocalDateTime.now();
    }

    public String getId() {
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
