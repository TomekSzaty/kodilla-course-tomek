package com.kodilla.kodillahibernate.manytomany.dao.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import com.kodilla.kodillahibernate.manytomany.facade.CompanyEmployeeNotFoundException;
import com.kodilla.kodillahibernate.manytomany.facade.Facade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testGetCompanyByName() {
        //Given
        Company dataMasters = new Company("Data Masters");
        companyDao.save(dataMasters);

        //When
        int dataMastersId = dataMasters.getId();

        //Then
        try {
            facade.getCompanyByName("ste");
        } catch (CompanyEmployeeNotFoundException e) {
            //busines exception- should be handled in real app
        }
        //CleanUp
        companyDao.deleteById(dataMastersId);
    }

    @Test
    void testGetEmployeeByName() {
        //Given
        Employee johnDoe = new Employee("John", "Dalton");
        employeeDao.save(johnDoe);

        //When
        int nameId = johnDoe.getId();

        //Then
        try {
            facade.getEmployeeByName("ton");
        } catch (CompanyEmployeeNotFoundException e) {
            //busines exception- should be handled in real app
        }

        //CleanUp
        employeeDao.deleteById(nameId);
    }
}
