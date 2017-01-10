package com.carre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.carre.model.Categorie;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CategorieDAOImpl implements CategorieDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCategorie(Categorie c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Categorie saved successfully, Categorie Details="+c);
	}

	@Override
	public void updateCategorie(Categorie c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Categorie updated successfully, Categorie Details="+c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categorie> listCategorie() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Categorie> CategorieList = session.createQuery("from Categorie").list();
		for(Categorie c : CategorieList){
			logger.info("Person List::"+c);
		}
		return CategorieList;
	}

	@Override
	public Categorie getCategorieById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Categorie c = (Categorie) session.load(Categorie.class, new Integer(id));
		logger.info("Categorie loaded successfully, Categorie details="+c);
		return c;
	}



}

