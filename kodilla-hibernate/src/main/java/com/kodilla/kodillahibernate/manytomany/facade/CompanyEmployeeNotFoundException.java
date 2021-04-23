package com.kodilla.kodillahibernate.manytomany.facade;

public class CompanyEmployeeNotFoundException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public CompanyEmployeeNotFoundException(String message) {
        super(message);
    }
}
