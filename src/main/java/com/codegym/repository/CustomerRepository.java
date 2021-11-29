package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Transactional
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean insertWithStoreProcedure(Customer customer) {
        Query query= entityManager.createNativeQuery("CALL insert_customer(:firstName,:lastName)");
        query.setParameter("firstName",customer.getFirstName());
        query.setParameter("lastName",customer.getLastName());
        return query.executeUpdate()==0;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void save(Long id) {

    }
}
