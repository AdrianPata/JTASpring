package ro.pata.jta.spring.service;

import ro.pata.jta.spring.model.EmployeeA;
import ro.pata.jta.spring.model.EmployeeB;

public interface EmployeeService {
    void persistEmployees(EmployeeA employeeA, EmployeeB employeeB) throws Exception;
}
