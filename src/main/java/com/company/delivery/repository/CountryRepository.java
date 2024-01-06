package com.company.delivery.repository;

import com.company.delivery.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Short> {
}
