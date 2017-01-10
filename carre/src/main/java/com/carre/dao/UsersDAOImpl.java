/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.dao;

import com.carre.model.Users;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rowan
 */
@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {

    private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addUsers(Users p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Product saved successfully, Product Details=" + p);
    }

    @Override
    public void updateUsers(Users p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Product updated successfully, Product Details=" + p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Users> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Users> userlist = session.createQuery("from Users").list();
        for (Users p : userlist) {
            logger.info("users List::" + p);
        }
        return userlist;
    }

    @Override
    public Users getUsersById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Users p = (Users) session.load(Users.class, new Integer(id));
        logger.info("users loaded successfully, user details=" + p);
        return p;
    }

    @Override
    public boolean userValidate(String username, String password) {
        Session session = this.sessionFactory.getCurrentSession();
        //voert query uit en kijkt of er al zelfde product in cart zit
        Query query = session.createQuery("from Users where username = :username AND password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        List<Users> userslist = query.list();
        int count = 0;
        for (Users po : userslist) {
            count++;
        }

        //kijkt naar het aantal dat al in de cart zit.
        if (count > 0) {
         
            return true;
        } else {
     
            return false;

        }
        
    }

}
