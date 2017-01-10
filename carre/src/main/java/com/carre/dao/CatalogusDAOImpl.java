package com.carre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.carre.model.Catalogus;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CatalogusDAOImpl implements CatalogusDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCatalogus(Catalogus c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Catalogus saved successfully, Catalogus Details="+c);
	}

	@Override
	public void updateCatalogus(Catalogus c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Catalogus updated successfully, Catalogus Details="+c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Catalogus> listCatalogus() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Catalogus> CatalogusList = session.createQuery("from Catalogus").list();
		for(Catalogus c : CatalogusList){
			logger.info("Person List::"+c);
		}
		return CatalogusList;
	}

	@Override
	public Catalogus getCatalogusById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Catalogus c = (Catalogus) session.load(Catalogus.class, new Integer(id));
		logger.info("Catalogus loaded successfully, Catalogus details="+c);
		return c;
	}



}

