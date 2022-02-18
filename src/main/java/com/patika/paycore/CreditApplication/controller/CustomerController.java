package com.patika.paycore.CreditApplication.controller;


import com.patika.paycore.CreditApplication.model.Customer;
import com.patika.paycore.CreditApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @RequestMapping(method= RequestMethod.GET, path= "/hello")
    public String hello() {
        return "denemeler";
    }

    @GetMapping(path = "/all")
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }
    @PostMapping(path= "/get")
    public Customer getCustomer(@RequestParam Integer id){
        return  customerService.getCustomer(id);
    }

    @PostMapping(path = "/add")
    public boolean addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);

    }

    @PutMapping(value = "/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping(value = "/delete/id={id}")
    public boolean deleteCustomer(@PathVariable Integer id) {
        return customerService.deleteCustomer(id);
    }








}
