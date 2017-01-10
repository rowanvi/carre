/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.carre.model.Winkelwagen;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component
@Transactional
public class WinkelwagenDAOImpl implements WinkelwagenDAO {

    private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addCart(Winkelwagen w, int voorstellingid, String voornaam, String achternaam, String email, String sessieid) {
        Session session = this.sessionFactory.getCurrentSession();
        Winkelwagen emp = new Winkelwagen();
        Date date = new Date();
        emp.setVoornaam(voornaam);
        emp.setAchternaam(achternaam);
        emp.setEmail(email);
        emp.setVoorstellingid(voorstellingid);
        emp.setSessieid(sessieid);
        emp.setStatus(1);
        emp.setDate("" + date);
        session.save(emp);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void updateCart(Winkelwagen w) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(w);
        logger.info("Winkelwagen updated successfully, Winkelwagen Details=" + w);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Winkelwagen> listCartByDate(String beginDatum, String eindDatum) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Winkelwagen where date >= :bdate");
        query.setParameter("bdate", beginDatum);

        List<Winkelwagen> winkelwagen = query.list();
        return winkelwagen;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Winkelwagen> listCartByVoorstellingId(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        List<Winkelwagen> winkelwagenList = session.createQuery("from Winkelwagen where voorstellingid = " + id).list();
        for (Winkelwagen w : winkelwagenList) {
            logger.info("Winkelwagen List::" + w);
        }
        return winkelwagenList;
    }

    @Override
    public Winkelwagen getCartById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Winkelwagen where sessieid = :sessieid");
        query.setParameter("sessieid", id);
        List<Winkelwagen> winkelwagen = query.list();
        return winkelwagen.get(0);

    }

    public void updateCartStatus(Winkelwagen w, int status, int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Query q = session.createQuery("update Winkelwagen set status= :status where winkelwagenid = :id");
        q.setParameter("status", status);
        q.setParameter("id", id);
        q.executeUpdate();
        session.getTransaction().commit();

    }

}
