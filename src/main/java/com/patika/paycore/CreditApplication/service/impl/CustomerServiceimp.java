package com.patika.paycore.CreditApplication.service.impl;

import com.patika.paycore.CreditApplication.model.Customer;
import com.patika.paycore.CreditApplication.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceimp implements CustomerService {

    private List<Customer> customers = new ArrayList<>();

    {
        customers.add(new Customer("Burkay 1"));
        customers.add(new Customer("Onur"));
    }



    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomer(Integer id) {
        return null;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customers.add(customer);

    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return false;
    }
}
