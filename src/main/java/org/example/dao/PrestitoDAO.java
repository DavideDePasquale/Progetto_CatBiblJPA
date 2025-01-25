package org.example.dao;

import org.example.entities.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

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
    public List<Prestito> ricercaElemOraInPrestito (){
        Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numero_tessera = :utenteId AND p.data_restituzione_effettiva IS NULL");
        q.setParameter("utenteId", Long.valueOf(71)); //devo mettere il valueOf senno passando un valore di tipo int (71) mi da errore non essendo di tipo Long
        return q.getResultList();
    }
    public List<Prestito> ricercaPrestitiScaduti(){
        Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.data_restituzione_prevista < CURRENT_DATE AND p.data_restituzione_effettiva IS NULL");
        return q.getResultList();
    }
}
