package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.Customer;
import com.company.delivery.entity.FoodOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.util.HashSet;
import java.util.Set;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRequestDTO {
    @Email
    @NotBlank
    private String customerEmail;
    @NotBlank
    private String password;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String Gender;
    @NotBlank
    private Address customerAddress;





}
