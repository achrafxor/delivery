package com.company.delivery.entity;

import com.company.delivery.utils.OrderStatusEnum;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="OrderStatus")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderStatusId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatusEnum orderStatus;

    @OneToMany(mappedBy = "orderStatus", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders = new ArrayList<FoodOrder>();


}
