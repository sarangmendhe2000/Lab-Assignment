package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	boolean addProduct();

	List<Product> displayAll();

	boolean updateById(int id, double price);

	boolean deleteById(int id);

	Product findByProductId(int id);

	List<Product> sort();

	List<Product> findByCid(int id);

}
