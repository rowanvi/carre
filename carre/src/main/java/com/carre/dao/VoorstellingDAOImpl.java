package com.carre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.carre.model.Voorstelling;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component
@Transactional
public class VoorstellingDAOImpl implements VoorstellingDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addVoorstelling(Voorstelling c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Voorstelling saved successfully, Voorstelling Details="+c);
	}

	@Override
	public void updateVoorstelling(Voorstelling c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Voorstelling updated successfully, Voorstelling Details="+c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Voorstelling> listVoorstelling() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Voorstelling> VoorstellingList = session.createQuery("from Voorstelling where datum >= current_date").list();
		for(Voorstelling c : VoorstellingList){
			logger.info("Voorstelling ist::"+c);
		}
		return VoorstellingList;
	}
        
        @SuppressWarnings("unchecked")
	@Override
	public List<Voorstelling> listVoorstellingAdmin() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Voorstelling> VoorstellingList = session.createQuery("from Voorstelling").list();
		for(Voorstelling c : VoorstellingList){
			logger.info("Voorstelling ist::"+c);
		}
		return VoorstellingList;
	}
        
	@Override
	public Voorstelling getVoorstellingById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Voorstelling c = (Voorstelling) session.load(Voorstelling.class, new Integer(id));
		logger.info("Voorstelling loaded successfully, Voorstelling details="+c);
		return c;
	}



}

