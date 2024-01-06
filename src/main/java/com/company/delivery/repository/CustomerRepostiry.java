package com.company.delivery.repository;

import com.company.delivery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepostiry extends JpaRepository<Customer,Integer> {
}
