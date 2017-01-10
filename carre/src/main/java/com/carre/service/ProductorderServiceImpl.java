package com.carre.service;

import com.carre.dao.ProductorderDAO;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.ProductorderDAOImpl;
import com.carre.model.Product;
import com.carre.model.ProductOrder;

@Service
@Transactional
public class ProductorderServiceImpl implements ProductorderService {


    
    private ProductorderDAO productOrderDAO;

    public void setProductorderDAO(ProductorderDAO productOrderDAO) {
        this.productOrderDAO = productOrderDAO;
    }

    @Override
    public void addProductorder(ProductOrder p, int id, String sessieid) {
        this.productOrderDAO.addProductorder(p, id, sessieid);
    }
    
    
    @Override
    public void updateProductorder(ProductOrder p) {
        this.productOrderDAO.updateProductorder(p);
    }
    
    @Override
    public void updateProductorderAantal(ProductOrder p, int aantal, int id){
        this.productOrderDAO.updateProductorderAantal(p, aantal, id);
    }
    
    @Override
    public void removeProductorder(ProductOrder p, int id){
        this.productOrderDAO.removeProductorder(p, id);
    }

    @Override
    public List<ProductOrder> listProductorder() {
        return this.productOrderDAO.listProductorder();
    }
    
    @Override
    public List<ProductOrder> listProductorderNieuw(String id) {
        return this.productOrderDAO.listProductorderNieuw(id);
    }
    
    @Override
    public ProductOrder getProductById(int id) {
        return this.productOrderDAO.getProductById(id);
    }
    
        @Override
    public List<ProductOrder> getProductorderBySessieId(String sessieid) {
        return this.productOrderDAO.getProductorderBySessieId(sessieid);
    }
    
    
}