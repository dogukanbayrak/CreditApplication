package com.patika.paycore.CreditApplication.model.mapper;

import com.patika.paycore.CreditApplication.model.Customer;
import com.patika.paycore.CreditApplication.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

        CustomerDTO toDto(Customer entity);

        Customer toEntity(CustomerDTO dto);



}
