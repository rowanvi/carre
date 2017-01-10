/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.service;

import com.carre.model.Product;
import com.carre.model.ProductOrder;
import java.util.List;

/**
 *
 * @author Rowan
 */
public interface ProductorderService {

    public void addProductorder(ProductOrder p, int id, String sessieid);
    public void updateProductorder(ProductOrder p);
    public void updateProductorderAantal(ProductOrder p, int aantal, int id);
    public void removeProductorder(ProductOrder p, int id);
    public List<ProductOrder> listProductorder();
    public List<ProductOrder> listProductorderNieuw(String id);
     public ProductOrder getProductById(int id);
     public List<ProductOrder> getProductorderBySessieId(String sessieid);
}
