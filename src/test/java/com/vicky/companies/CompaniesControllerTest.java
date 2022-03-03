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
    @InjectMocks
    private CompaniesController companiesController;

    @Mock
    private CompaniesService companiesService;

    private Company company;

    private List<Company> companies;

    @BeforeEach
    void setupTests(){
        company = new Company(1L, "7658990", "Barber");
        Company two = new Company (2l, "SC1010", "Hairdressers");
        companies = new ArrayList<Company>();
        companies.add(company);
        companies.add(two);
    }

    @Test
    void testGetCompanySuccess(){
        when(companiesService.getComapany(1L)).thenReturn(company);
        long expectedId = 1l;

        long actualId = companiesController.getComapny(1L).getId();

        assertEquals(expectedId, actualId);
    }

    @Test
    void testGetCompaniesSuccess(){
        when(companiesService.getCompanies()).thenReturn(companies);
        long expectedId = 1L;
        long expectedId2 = 2L;

        List <Company> actualList = companiesController.getCompanies();
        long actualId = actualList.get(0).getId();
        long actualId2 = actualList.get(1).getId();

        assertEquals(expectedId, actualId);
        assertEquals(expectedId2, actualId2);

    }

    @Test
    void testPostRequestCreatesCompanySuccess(){

        NewCompany newCompany = new NewCompany("Barber","7658990");
        Company company = new Company(1L,"7658990","Barber");
        when(companiesService.createCompany(newCompany)).thenReturn(company);

        Company actual = companiesController.createCompany(newCompany);

        // Assert that the company in the post request is the company returned by the method
        assertEquals(company.getId(), actual.getId());
        assertEquals(company.getCompanyNumber(), actual.getCompanyNumber());
        assertEquals(company.getCompanyName(), actual.getCompanyName());

    }


}
