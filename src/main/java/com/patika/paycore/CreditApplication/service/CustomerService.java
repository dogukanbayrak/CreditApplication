package com.patika.paycore.CreditApplication.service;

import com.patika.paycore.CreditApplication.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

   Customer getCustomer(Integer id);

   boolean addCustomer(Customer customer);

   Customer updateCustomer(Customer customer);

   boolean deleteCustomer(Integer id);






}
