package com.company.delivery.repository;

import com.company.delivery.entity.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuCategory,Integer> {
}
