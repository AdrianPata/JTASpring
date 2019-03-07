package ro.pata.jta.spring.dao;

import org.springframework.stereotype.Service;
import ro.pata.jta.spring.model.EmployeeA;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class EmployeeADAOImpl implements EmployeeADAO {

    @PersistenceContext(unitName = "PersistenceUnitA")
    private EntityManager entityManager;

    public void persistEmployee(EmployeeA employee) {
        entityManager.persist(employee);
    }
}
