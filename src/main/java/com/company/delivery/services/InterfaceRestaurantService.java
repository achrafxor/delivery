package com.company.delivery.services;

import com.company.delivery.entity.Restaurant;

import java.util.List;

public interface InterfaceRestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllrestaurants();
    Restaurant updateRestaurant(Restaurant restaurant);
    void deleteRestaurantById(Integer restaurantId);
}
