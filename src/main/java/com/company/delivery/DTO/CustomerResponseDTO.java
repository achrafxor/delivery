package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.FoodOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerResponseDTO {

    private String customerEmail;
    private String firstName;
    private String lastName;
    private Address customerAddress;
    private Set<FoodOrder> orderSet = new HashSet<>();
}
