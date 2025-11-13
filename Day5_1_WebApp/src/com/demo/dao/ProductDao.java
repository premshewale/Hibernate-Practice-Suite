package com.demo.dao;



import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {
	
	void addProduct(Product p);
	List<Product> getAllProduct();
	Product searchById(Product P);
	void deleteProduct(Product ProdId);
	void updateProduct(Product P );
	
}
