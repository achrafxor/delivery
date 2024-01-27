package com.company.delivery;

import com.company.delivery.entity.*;
import com.company.delivery.repository.RestaurantRepository;
import com.company.delivery.utils.Nationality;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}


}
