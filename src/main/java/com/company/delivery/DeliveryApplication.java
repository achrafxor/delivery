package com.company.delivery;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.Brand;
import com.company.delivery.entity.Country;
import com.company.delivery.entity.Restaurant;
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
							"Djerba",
							"houmt souk",
                            (short) 4185,
							new Country("tunisia")),
					new Brand(
							"macdonalds",
							Nationality.AFGHAN,
							new Address(
									"Djerbax",
									"houmt soukx",
									(short) 4180,
									new Country("zambia"))
					));
repository.save(brik);


		};
	}


}
