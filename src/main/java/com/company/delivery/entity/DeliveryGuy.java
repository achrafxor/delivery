package com.company.delivery.entity;

import jakarta.persistence.*;
@Entity(name="DeliveryGuy")
public class DeliveryGuy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deliveryGuyId;
    @Column(nullable = false,unique = false)
    private String firstNameName;
    @Column(nullable = false,unique = false)
    private String lastName;
    @Column(nullable = false,unique = false)
    private String Number;

    @Column(nullable = false,unique = true)
    private String userName;

    @Column(nullable = false,unique = false)
    private String eMail;

    @Column(nullable = false,unique = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address deliveryGuyAddress;
}
