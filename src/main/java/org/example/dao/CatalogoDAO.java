package org.example.dao;

import org.example.entities.Catalogo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

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
    //public static List
    // RICERCA TRAMITE ISBN
    public List<Catalogo> ricercaXISBN(){
        Query q = em.createQuery("SELECT c FROM Catalogo c WHERE c.cod_ISBN = 70");
        return q.getResultList();
    }
    public List<Catalogo> ricercaXAnnoPubblicazione(){
        Query q = em.createQuery("SELECT c FROM Catalogo c WHERE c.anno_pubblicazione = 2023");
        return q.getResultList();
    }
    public List<Catalogo> ricercaXAutore(){
        Query q = em.createQuery("SELECT c FROM Catalogo c WHERE c.autore = 'Umberto Eco'");
        return q.getResultList();
    }
    public List<Catalogo> ricercaXTitoloOParte(){
        Query q = em.createQuery("SELECT c FROM Catalogo c WHERE c.titolo LIKE :titolo");
        q.setParameter("titolo","%Sp%"); // con "%sp%" non mi trova quei titoli :(
        return  q.getResultList();
    }
}
