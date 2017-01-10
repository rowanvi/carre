/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.dao;

import com.carre.model.Product;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.carre.model.ProductOrder;
import org.hibernate.Query;
import org.hibernate.Transaction;

@Repository

public class ProductorderDAOImpl implements ProductorderDAO {

    private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override

    public void addProductorder(ProductOrder p, int id, String sessieid) {

        Session session = this.sessionFactory.getCurrentSession();
        //voert query uit en kijkt of er al zelfde product in cart zit
        Query query = session.createQuery("from ProductOrder where sessieid = :sessieid AND productid = :id");
        query.setParameter("id", id);
        query.setParameter("sessieid", sessieid);
        List<ProductOrder> productList = query.list();
        int count = 0;
        int productorderId = 0;
        int aantal = 0;
        for (ProductOrder po : productList) {
            productorderId = po.getId();
            aantal = po.getAantal();
            count++;
        }

        //kijkt naar het aantal dat al in de cart zit.
        if (count > 0) {
            System.out.println("update");

            Query q = session.createQuery("update ProductOrder set aantal= :n where id = :orderid");
            q.setParameter("n", aantal + 1);
            q.setParameter("orderid", productorderId);

            int status = q.executeUpdate();
            session.getTransaction().commit();
        } else {
            ProductOrder emp = new ProductOrder();
            emp.setProductid(id);
            emp.setSessieid(sessieid);
            emp.setAantal(1);
            session.save(emp);
            session.getTransaction().commit();

        }
        session.close();

    }

    @Override
    public void updateProductorder(ProductOrder p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("ProductOrder updated successfully, Product Details=" + p);
    }

    public void updateProductorderAantal(ProductOrder p, int aantal, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("update ProductOrder set aantal= :aantal where id = :id");
        q.setParameter("aantal", aantal);
        q.setParameter("id", id);
        q.executeUpdate();
        session.getTransaction().commit();

    }

    public void removeProductorder(ProductOrder p, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("delete ProductOrder where id = :id");
        q.setParameter("id", id);
        q.executeUpdate();
        session.getTransaction().commit();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ProductOrder> listProductorder() {
        Session session = this.sessionFactory.getCurrentSession();
        List<ProductOrder> productList = session.createQuery("from ProductOrder").list();
        for (ProductOrder p : productList) {
            logger.info("ProductOrder List::" + p);
        }
        return productList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ProductOrder> listProductorderNieuw(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductOrder where sessieid = :id ");
        query.setParameter("id", id);
        List<ProductOrder> productList = query.list();
        for (ProductOrder p : productList) {
            logger.info("ProductOrder List::" + p);
        }
        return productList;
    }

    @Override
    public ProductOrder getProductById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        ProductOrder p = (ProductOrder) session.load(ProductOrder.class, new Integer(id));
        logger.info("Product loaded successfully, Product details=" + p);
        return p;
    }

    @Override
    public List<ProductOrder> getProductorderBySessieId(String sessieid) {
        Session session = this.sessionFactory.getCurrentSession();
//        List<ProductOrder> productList = session.createQuery("from ProductOrder where sessieid = " + id).list();
        Query query = session.createQuery("from ProductOrder where sessieid = :id ");
        query.setParameter("id", sessieid);
        List<ProductOrder> productList = query.list();
        for (ProductOrder p : productList) {
            logger.info("ProductOrder List::" + p);
        }
        return productList;
    }

}
