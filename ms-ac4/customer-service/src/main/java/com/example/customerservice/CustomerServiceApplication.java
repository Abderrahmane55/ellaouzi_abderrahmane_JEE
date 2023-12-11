package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("abderrahmane").email("abderrahmane@gmail.com").build(),
					Customer.builder().name("amine").email("amine@gmail.com").build(),
					Customer.builder().name("anas").email("anas@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}