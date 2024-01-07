package com.company.delivery.repository;

import com.company.delivery.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepository extends JpaRepository<FoodOrder,Integer> {
}
