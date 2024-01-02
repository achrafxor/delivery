package com.company.delivery.entity;


import jakarta.persistence.*;

@Entity(name="Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false,unique = true)
    private String customerEmail;
    @Column(nullable = false,unique = false)
    private String firstName;

    @Column(nullable = false,unique = false)
    private String lastName;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false,unique = false)
    private String password;
}
