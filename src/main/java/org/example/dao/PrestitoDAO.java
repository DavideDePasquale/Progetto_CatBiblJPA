package org.example.dao;

import org.example.entities.Prestito;

import javax.persistence.EntityManager;

public class PrestitoDAO {

    private static EntityManager em;

    public PrestitoDAO(EntityManager em){
        this.em = em;
    }
    public void save(Prestito prestito){
        em.getTransaction().begin();
        em.persist(prestito);
        em.getTransaction().commit();
    }
    public Prestito getById(long id_prestito){
        return em.find(Prestito.class,id_prestito);
    }
    public void delete(Prestito prestito){
        em.getTransaction().begin();
        em.remove(prestito);
        em.getTransaction().commit();
    }
}
