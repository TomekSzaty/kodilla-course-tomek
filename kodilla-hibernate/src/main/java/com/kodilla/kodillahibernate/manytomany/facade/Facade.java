package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    @Autowired
    private final CompanyDao companyDao;
    @Autowired
    private final EmployeeDao employeeDao;


    public Facade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    public List<Company> getCompanyByName(String companyLetters) throws CompanyEmployeeNotFoundException {
        List<Company> companies = companyDao.retrieveCompanyByName(companyLetters);
        LOGGER.info("Searching for company name contains letters: " + companyLetters);
        if (companies.size() <= 0) {
            LOGGER.error(CompanyEmployeeNotFoundException.ERR_COMPANY_NOT_FOUND);
            throw new CompanyEmployeeNotFoundException(CompanyEmployeeNotFoundException.ERR_COMPANY_NOT_FOUND);
        }
        LOGGER.info("Found company is: " + companies);
        return companies;
    }
    public List<Employee> getEmployeeByName(String employeeLetters) throws CompanyEmployeeNotFoundException {
        List<Employee> employees = employeeDao.retrieveEmployeeByName(employeeLetters);
        LOGGER.info("Searching for employee name contains letters: " + employeeLetters);
        if (employees.size() <= 0) {
            LOGGER.error(CompanyEmployeeNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
            throw new CompanyEmployeeNotFoundException(CompanyEmployeeNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
        }
        LOGGER.info("Found employee is: " + employees);
        return employees;
    }
}
