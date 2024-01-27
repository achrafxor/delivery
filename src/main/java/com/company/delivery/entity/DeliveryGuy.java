package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="DeliveryGuy")
@Table
@Getter
@Setter
@NoArgsConstructor
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

    @OneToMany(mappedBy = "deliveryGuy", cascade = {CascadeType.REFRESH})
    private List<FoodOrder> foodOrders = new ArrayList<FoodOrder>();

    public DeliveryGuy( String firstNameName, String lastName, String number, String userName, String eMail, String password, Address deliveryGuyAddress, List<FoodOrder> foodOrders) {
        this.firstNameName = firstNameName;
        this.lastName = lastName;
        Number = number;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.deliveryGuyAddress = deliveryGuyAddress;
        this.foodOrders = foodOrders;
    }
}
