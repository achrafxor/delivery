package com.company.delivery.repository;

import com.company.delivery.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Integer> {
}
