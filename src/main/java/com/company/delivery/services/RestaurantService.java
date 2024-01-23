package com.company.delivery.services;

import com.company.delivery.entity.Restaurant;
import com.company.delivery.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class RestaurantService implements  InterfaceRestaurantService{
private RestaurantRepository restaurantRepository;


    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllrestaurants() {
        return restaurantRepository.findAll().stream().toList();
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteRestaurantById(Integer restaurantId) {
       restaurantRepository.deleteById(restaurantId);
    }
}
