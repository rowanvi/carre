package com.carre.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.ProductDAO;
import com.carre.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public void addProduct(Product p) {
        this.productDAO.addProduct(p);
    }

    @Override
    public void updateProduct(Product p) {
        this.productDAO.updateProduct(p);
    }

    @Override
    public List<Product> listProduct() {
        return this.productDAO.listProduct();
    }

    @Override
    public Product getProductById(int id) {
        return this.productDAO.getProductById(id);
    }
    
}
