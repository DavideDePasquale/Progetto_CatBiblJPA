package org.example;

import com.github.javafaker.Faker;
import org.example.dao.CatalogoDAO;
import org.example.dao.PrestitoDAO;
import org.example.dao.UtenteDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizioCatalogoBibl");
    private static EntityManager em = emf.createEntityManager();
    public static void main( String[] args ) {

        CatalogoDAO catalogoDao = new CatalogoDAO(em);
        PrestitoDAO prestitoDao = new PrestitoDAO(em);
        UtenteDAO utenteDao = new UtenteDAO(em);
        Faker faker = new Faker(Locale.ITALY);

    }
}
