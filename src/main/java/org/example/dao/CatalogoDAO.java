package org.example.dao;

import org.example.entities.Catalogo;

import javax.persistence.EntityManager;

public class CatalogoDAO {

    private static EntityManager em;

    public CatalogoDAO(EntityManager em){
        this.em = em;
    }
    public void save(Catalogo catalogo){
        em.getTransaction().begin();
        em.persist(catalogo);
        em.getTransaction().commit();
    }
    public Catalogo getById(long  cod_ISBN){
        return em.find(Catalogo.class,cod_ISBN);
    }
    public void delete(Catalogo catalogo){
        em.getTransaction().begin();
        em.remove(catalogo);
        em.getTransaction().commit();
    }
}
