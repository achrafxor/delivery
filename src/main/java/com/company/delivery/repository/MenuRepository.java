package com.company.delivery.repository;

import com.company.delivery.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
