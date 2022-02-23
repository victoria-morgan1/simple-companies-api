package com.vicky.companies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompaniesControllerTest {
    private CompaniesController companiesController;

    @BeforeEach
    void setupTests(){
        companiesController = new CompaniesController();
    }

    @Test
    void testGetCompanySuccess(){
        long expectedId = 1l;

        long actualId = companiesController.getComapny(1L).getId();

        assertEquals(expectedId, actualId);
    }

    @Test
    void testGetCompaniesSuccess(){
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

        Company expected = new Company(1L, "987066", "Test company");

        Company actual = companiesController.createCompany(new Company(1L, "987066", "Test company"));

        // Assert that the company in the post request is the company returned by the method
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getCompanyNumber(), actual.getCompanyNumber());
        assertEquals(expected.getCompanyName(), actual.getCompanyName());

    }
}
