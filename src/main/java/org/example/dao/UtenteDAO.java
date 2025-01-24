package org.example.dao;

import org.example.entities.Utente;

import javax.persistence.EntityManager;

public class UtenteDAO {

    private static EntityManager em;

    public UtenteDAO(EntityManager em){
        this.em = em;
    }
    public void save(Utente utente){
        em.getTransaction().begin();
        em.persist(utente);
        em.getTransaction().commit();
    }
    public Utente getById(long numero_tessera){
        return em.find(Utente.class, numero_tessera);
    }
    public void delete(Utente utente){
        em.getTransaction().begin();
        em.remove(utente);
        em.getTransaction().commit();
    }
}
