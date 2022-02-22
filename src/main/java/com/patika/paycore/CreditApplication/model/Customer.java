package com.patika.paycore.CreditApplication.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer" )
public class Customer {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String customer_name;

    @NotBlank
    private String customer_surname;

    @NotBlank
    private Integer customer_income;

    @NotBlank
    private String customer_phone;

    @NotBlank
    private String customer_identitynumber;




}
