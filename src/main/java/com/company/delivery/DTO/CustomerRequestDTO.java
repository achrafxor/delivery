package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.Customer;
import com.company.delivery.entity.FoodOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerRequestDTO {
    @NotBlank
    private String customerEmail;

    private String password;

    private String firstName;

    private String lastName;

    private Address customerAddress;





}
