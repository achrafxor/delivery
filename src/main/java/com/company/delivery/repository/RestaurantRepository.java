package com.company.delivery.repository;

import com.company.delivery.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
