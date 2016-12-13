
package com.carre.service;

import java.util.List;

import com.carre.model.Product;

public interface ProductService {
    	public void addProduct(Product p);
	public void updateProduct(Product p);     
	public List<Product> listProduct();
	public Product getProductById(int id);
}
