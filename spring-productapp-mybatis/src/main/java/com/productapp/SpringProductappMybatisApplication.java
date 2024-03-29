package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}

	@Autowired
	IProductService iProductService;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		Product addProduct = new Product();
//		addProduct.setProductName("pixel4");
//		addProduct.setBrand("google");
//		addProduct.setCategory("electronics");
//		addProduct.setPrice(40000.0);
		
//		iProductService.addProduct(addProduct);
//		iProductService.updateProduct(1,2000);
		
		Product product = iProductService.getByID(2);
		System.out.println(product);
		
		iProductService.getAll().forEach(System.out::println);
	}

}
