package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.FoodOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

public class CustomerRequestDTO {
    @NotBlank
    private String customerEmail;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;


    private Address customerAddress;

}
