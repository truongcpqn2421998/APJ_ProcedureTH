package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    boolean insertWithStoreProcedure(Customer customer);
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    void save(Long id);

}
