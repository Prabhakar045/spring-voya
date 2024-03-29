package com.productapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

@Mapper
public interface IProductRepository {

	@Insert("insert into product(product_name, brand,price,category) values(#{productName},#{brand},#{price},#{category})")
	void addProduct(Product product);
	
	@Insert("update product set price=#{price} where product_id= #{productId}")
	void updateProduct(int productId,double price);
	
	@Insert("delete from product where product_id= #{productId}")
	void deleteProduct(int productId);
	
	@Select("select * from product where product_id=#{productId}")
	Product findByID(int productId)throws ProductNotFoundException;
	
	@Select("select product_name,product_id from product")
	List<Product> findAll();
	
	@Select("select * from product where brand=#{brand}")
	List<Product> findByBrand(String brand)throws ProductNotFoundException;
	
	@Select("select * from product where price=#{price}")
	List<Product> findByLessPrice(double price)throws ProductNotFoundException;
	
	@Select("select * from product where category=#{category} and price=#{price}")
	List<Product> findByCategoryandPrice(String category, double price)throws ProductNotFoundException;
}
