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

/**
 *
 * @author Evert
 */
public class BaseDaoImpl implements BaseDao {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void persist(Object obj) {
        
        em.persist(obj);
    }

    @Override
    public <T> List<T> getALL(Class<T> clazz) {
        TypedQuery<T> query = em.createQuery(" from " + clazz.getName(), clazz);
        return query.getResultList();
    }
    
}
