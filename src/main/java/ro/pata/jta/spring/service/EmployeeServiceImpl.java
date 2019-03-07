package ro.pata.jta.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.pata.jta.spring.dao.EmployeeADAO;
import ro.pata.jta.spring.dao.EmployeeBDAO;
import ro.pata.jta.spring.model.EmployeeA;
import ro.pata.jta.spring.model.EmployeeB;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeADAO employeeADAO;

    @Autowired
    EmployeeBDAO employeeBDAO;

    @Transactional(rollbackFor = Exception.class)
    public void persistEmployees(EmployeeA employeeA, EmployeeB employeeB) throws Exception {
        System.out.println("Persist A");
        employeeADAO.persistEmployee(employeeA);

        System.out.println("Persist B");
        employeeBDAO.persistEmployee(employeeB);

        System.out.println("OK");
    }
}
