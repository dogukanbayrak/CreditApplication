package com.patika.paycore.CreditApplication.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerDTO {


    private String name;


    private String surname;


    private Integer income;


    private String phone;


    private String identitynumber;


}
