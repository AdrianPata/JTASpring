package ro.pata.jta.spring.dao;

import org.springframework.stereotype.Service;
import ro.pata.jta.spring.model.EmployeeB;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class EmployeeBDAOImpl implements EmployeeBDAO {
    @PersistenceContext(unitName = "PersistenceUnitB")
    private EntityManager entityManager;

    public void persistEmployee(EmployeeB employee) {
        entityManager.persist(employee);
    }
}
