package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public boolean insertWithStoreProcedure(Customer customer) {
       return customerRepository.insertWithStoreProcedure(customer);
    }
}
