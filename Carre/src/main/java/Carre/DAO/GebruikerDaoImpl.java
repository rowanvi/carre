/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carre.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import Carre.model.Gebruiker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Evert
 */
@Repository
@Transactional
public class GebruikerDaoImpl implements GebruikerDao {
    
    @Autowired
    SessionFactory sessionFactory;
    
    protected Session getCurrentSession(){
      return sessionFactory.getCurrentSession();
   }
    
    @Override
    public void persist(Gebruiker obj) {
        
        getCurrentSession().save(obj);
       
    }

    @Override
    public Gebruiker getALL() {
        Object load = getCurrentSession().byId(Gebruiker.class).load(1);
        return (Gebruiker) load;
    }
    
}
