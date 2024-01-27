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

	@Bean
	CommandLineRunner commandLineRunner(RestaurantRepository repository){
		return  args -> {
			Restaurant brik=new Restaurant(
					"BRIK BELGACEM",
					"53570230",
					"restaurant for making briks",
					new Address(
							new City("Mednine",new Country("Tunisia")),
							"houmt souk",
                            (short) 4185),
					new Brand(
							"macdonalds",
							Nationality.AFGHAN,
							new Address(
									new City("Nabeul",new Country("Tunisia")),
									"houmt soukx",
									(short) 4180)
					));
repository.save(brik);


		};
	}


}
