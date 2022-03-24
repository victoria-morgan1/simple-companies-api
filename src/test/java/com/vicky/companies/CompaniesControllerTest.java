package com.vicky.companies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CompaniesControllerTest {
    public static final String ID = "1";
    @InjectMocks
    private CompaniesController companiesController;

    @Mock
    private CompaniesService companiesService;

    private Company company;

    private List<Company> companies;

    @BeforeEach
    void setupTests(){
        company = new Company(ID, "7658990", "Barber");
        Company two = new Company ("2", "SC1010", "Hairdressers");
        companies = new ArrayList<Company>();
        companies.add(company);
        companies.add(two);
    }

    @Test
    void testGetCompanySuccess(){
        when(companiesService.getComapany(ID)).thenReturn(company);
        String expectedId = ID;

        String actualId = companiesController.getCompany(ID).getId();

        assertEquals(expectedId, actualId);
    }

    @Test
    void testGetCompaniesSuccess(){
        when(companiesService.getCompanies()).thenReturn(companies);
        String expectedId = ID;
        String expectedId2 = "2";

        List <Company> actualList = companiesController.getCompanies();
        String actualId = actualList.get(0).getId();
        String actualId2 = actualList.get(1).getId();

        assertEquals(expectedId, actualId);
        assertEquals(expectedId2, actualId2);

    }

    @Test
    void testPostRequestCreatesCompanySuccess(){

        NewCompany newCompany = new NewCompany("Barber","7658990");
        Company company = new Company(ID,"7658990","Barber");
        when(companiesService.createCompany(newCompany)).thenReturn(company);

        Company actual = companiesController.createCompany(newCompany);

        // Assert that the company in the post request is the company returned by the method
        assertEquals(company.getId(), actual.getId());
        assertEquals(company.getCompanyNumber(), actual.getCompanyNumber());
        assertEquals(company.getCompanyName(), actual.getCompanyName());

    }


}
