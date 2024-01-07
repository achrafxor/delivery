package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="DeliveryGuy")
@Table
public class DeliveryGuy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "deliveryGuy", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders = new ArrayList<FoodOrder>();
}
