package com.company.delivery.repository;

import com.company.delivery.entity.CartDish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDishRepository extends JpaRepository<CartDish,Integer> {
}
