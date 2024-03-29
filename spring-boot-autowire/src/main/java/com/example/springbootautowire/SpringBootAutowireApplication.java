package com.example.springbootautowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.spring.food.Waiter;

@SpringBootApplication(scanBasePackages = {"com.example","com.spring"})
public class SpringBootAutowireApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	
	@Autowired
	Waiter waiter;

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<String> menus = waiter.viewMenu("indian");
		for(String menu:menus) {
			System.out.println(menu);
		}
	}

}
