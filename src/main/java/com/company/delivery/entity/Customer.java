package com.company.delivery.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="Customer")
@Table
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @Column(nullable = false,unique = true)
    private String customerEmail;
    @Column(nullable = false,unique = false)
    private String firstName;

    @Column(nullable = false,unique = false)
    private String lastName;

    @Column(nullable = false,unique = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address customerAddress;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.REFRESH})
    private Set<FoodOrder> orderSet = new HashSet<>();

    public Customer( String customerEmail, String firstName, String lastName, String password, Address customerAddress, Set<FoodOrder> orderSet) {
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.customerAddress = customerAddress;
        this.orderSet = orderSet;
    }
}
