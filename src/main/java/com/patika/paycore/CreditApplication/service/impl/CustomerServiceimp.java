package com.patika.paycore.CreditApplication.service.impl;

import com.patika.paycore.CreditApplication.model.Customer;
import com.patika.paycore.CreditApplication.repository.CustomerRepository;
import com.patika.paycore.CreditApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceimp implements CustomerService {

    @Autowired
   private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> all=customerRepository.findAll();
        return all;
    }

    @Override
    public Customer getCustomer(Integer id) {
        Optional<Customer> byId = customerRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        Customer save = customerRepository.save(customer);
        if(save == null)
            return false;
        return true;
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return true;
    }
}
