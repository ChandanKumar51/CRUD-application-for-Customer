package com.CRUD.application.service;
import com.CRUD.application.entity.Customer;

import java.util.List;

public interface CustomerService{
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);
}
