package com.company.delivery.DTO;

import com.company.delivery.entity.*;
import com.company.delivery.utils.OrderStatusEnum;

import java.util.HashSet;
import java.util.Set;

public class FoodOrderResponseDTO {
    private Customer customer;
    private Restaurant restaurant;

    private String orderTime;

    private OrderStatusEnum orderStatus;

    private Set<CartDish> CartDishes = new HashSet<>();

    private Set<CartExtra> CartExtras = new HashSet<>();

    private DeliveryGuy deliveryGuy;

    private Address foodOrderAddress;
}
