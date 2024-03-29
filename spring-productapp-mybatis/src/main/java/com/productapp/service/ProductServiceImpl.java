package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductRepository iProductRepository;
	
	

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		iProductRepository.addProduct(product);
	}

	@Override
	public void updateProduct(int productId,double price) {
		// TODO Auto-generated method stub
		iProductRepository.updateProduct(productId,price);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getByID(int productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return iProductRepository.findByID(productId);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return  iProductRepository.findAll();
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategoryandPrice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



}
