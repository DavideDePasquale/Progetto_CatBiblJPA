package org.example;

import com.github.javafaker.Faker;
import org.example.Enumeration.TipoGenere;
import org.example.Enumeration.TipoPubblicazione;
import org.example.dao.CatalogoDAO;
import org.example.dao.PrestitoDAO;
import org.example.dao.UtenteDAO;
import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Faker faker = new Faker(Locale.ITALY); //messo giusto per per ora. (scherzo, mi è servito per crearmi gli utenti :) )

       // Mi credo degli oggetti di tipo Libro.
        // CREATI GIA



            //       PUNTO 1 : AGGIUNTA ELEMENTO NEL CATALOGO    (primo punto esercitazione)       👍👍👍👍👍
//        Catalogo c1 = new Libro("Il Nome della Rosa", 1980, 500, "Umberto Eco", TipoGenere.GIALLO);
//        Catalogo c2 = new Libro("Il Signore degli Anelli", 1954, 1200, "J.R.R. Tolkien", TipoGenere.FANTASY);
//        Catalogo c3 = new Libro("Il Codice da Vinci", 2003, 689, "Dan Brown", TipoGenere.GIALLO);
//        Catalogo c4 = new Libro("Harry Potter e la Pietra Filosofale", 1997, 223, "J.K. Rowling", TipoGenere.FANTASY);
//        Catalogo c5 = new Libro("Dracula", 1897, 418, "Bram Stoker", TipoGenere.HORROR);
//        Catalogo c6 = new Libro("Il Gattopardo", 1958, 400, "Giuseppe Tomasi di Lampedusa", TipoGenere.NARRATIVO);
//        Catalogo c7 = new Libro("I Promessi Sposi", 1827, 700, "Alessandro Manzoni", TipoGenere.STORICO);
//        Catalogo c8 = new Libro("Orgoglio e Pregiudizio", 1813, 350, "Jane Austen", TipoGenere.ROMANTICO);
//        Catalogo c9 = new Libro("Il Codice da Vinci",2003, 689, "Dan Brown", TipoGenere.THRILLER);
//        Catalogo c10 = new Libro("La Caverna", 2000, 350, "José Saramago", TipoGenere.NARRATIVO);
//        Catalogo c11 = new Libro("La Storia", 1974, 500, "Elsa Morante", TipoGenere.STORICO);
//        Catalogo c12 = new Libro("Cime Tempestose", 1847, 400, "Emily Brontë", TipoGenere.ROMANTICO);
//
//        catalogoDao.save(c1);
//        catalogoDao.save(c2);
//        catalogoDao.save(c3);
//        catalogoDao.save(c4);
//        catalogoDao.save(c5);
//        catalogoDao.save(c6);
//        catalogoDao.save(c7);
//        catalogoDao.save(c8);
//        catalogoDao.save(c9);
//        catalogoDao.save(c10);
//        catalogoDao.save(c11);
//        catalogoDao.save(c12);


                 //Mi sto creando oggetti di tipo Rivista
        //CREATI GIA
//        Catalogo r1 = new Rivista("Gazzetta della Sera", 2023, 120, TipoPubblicazione.SETTIMANALE);
//        Catalogo r2 = new Rivista("Gazzetta del Mezzogiorno",2023, 100, TipoPubblicazione.MENSILE);
//        Catalogo r3 = new Rivista("Chi", 2023, 90, TipoPubblicazione.SEMESTRALE);
//        Catalogo r4 = new Rivista("Novella2000", 2000, 150, TipoPubblicazione.SETTIMANALE);
//        Catalogo r5 = new Rivista("TuttoSport", 2022, 120, TipoPubblicazione.MENSILE);
//        Catalogo r6 = new Rivista("EuroSport", 2020, 130, TipoPubblicazione.SEMESTRALE);
//        Catalogo r7 = new Rivista("Il Corriere dello Sport", 2020, 110, TipoPubblicazione.SETTIMANALE);
//        Catalogo r8 = new Rivista("Padel-Time",2023,54,TipoPubblicazione.SEMESTRALE);
//        Catalogo r9 = new Rivista("Novak Smash",2007,30,TipoPubblicazione.SETTIMANALE);
//        Catalogo r10 = new Rivista("Juve Mania",1985,10,TipoPubblicazione.MENSILE);
//        Catalogo r11 = new Rivista("Forza Bari", 2021,9,TipoPubblicazione.SETTIMANALE);
//        Catalogo r12 = new Rivista("In Puglia solo il Bari", 2007,30,TipoPubblicazione.SEMESTRALE);
//
//        catalogoDao.save(r1);
//        catalogoDao.save(r2);
//        catalogoDao.save(r3);
//        catalogoDao.save(r4);
//        catalogoDao.save(r5);
//        catalogoDao.save(r6);
//        catalogoDao.save(r7);
//        catalogoDao.save(r8);
//        catalogoDao.save(r9);
//        catalogoDao.save(r10);
//        catalogoDao.save(r11);
//        catalogoDao.save(r12);

        // mi creo gli utenti
//   GIA CREATI
//        Utente u1 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1999,10,10));
//        Utente u2 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2000,1,20));
//        Utente u3 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1978,12,25));
//        Utente u4 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(2003,4,2));
//        Utente u5 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1950,11,5));
//        Utente u6 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1998,2,12));
//        Utente u7 = new Utente("Alessandro","Del Piero",LocalDate.of(1974,9,9));
//        Utente u8 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1985,8,15));
//        Utente u9 = new Utente(faker.name().firstName(),faker.name().lastName(),LocalDate.of(1987,6,29));
//        Utente u10 = new Utente("Davide","De Pasquale",LocalDate.of(1998,6,5));
//
//        utenteDao.save(u1);
//        utenteDao.save(u2);
//        utenteDao.save(u3);
//        utenteDao.save(u4);
//        utenteDao.save(u5);
//        utenteDao.save(u6);
//        utenteDao.save(u7);
//        utenteDao.save(u8);
//        utenteDao.save(u9);
//        utenteDao.save(u10);

       // creazione elementi di tipo prestito.
        // GIA CREATO
//        Prestito p2 = new Prestito(utenteDao.getById(71), Arrays.asList(catalogoDao.getById(51)),LocalDate.of(2024,11,20), null);
//        prestitoDao.save(p2);
//        Prestito p3 = new Prestito(utenteDao.getById(74), Arrays.asList(catalogoDao.getById(54)),LocalDate.of(2025,1,3), LocalDate.of(2025,1,24));
//        prestitoDao.save(p3);
//        Prestito p4 = new Prestito(utenteDao.getById(76), Arrays.asList(catalogoDao.getById(59)),LocalDate.of(2025,1,5), null);
//        prestitoDao.save(p4);
//        Prestito p5 = new Prestito(utenteDao.getById(77), Arrays.asList(catalogoDao.getById(68)),LocalDate.of(2023,12,1), LocalDate.of(2024,1,6));
//        prestitoDao.save(p5);
//        Prestito p6 = new Prestito(utenteDao.getById(80), Arrays.asList(catalogoDao.getById(70)),LocalDate.of(2023,4,25), null);
//        prestitoDao.save(p6);
//        Prestito p7 = new Prestito(utenteDao.getById(74), Arrays.asList(catalogoDao.getById(55)),LocalDate.of(2024,9,2), LocalDate.of(2024,11,1));
//        prestitoDao.save(p7);
//        Prestito p8 = new Prestito(utenteDao.getById(75), Arrays.asList(catalogoDao.getById(60)),LocalDate.of(2025,1,20),null);
//        prestitoDao.save(p8);
//        Prestito p9 = new Prestito(utenteDao.getById(71), Arrays.asList(catalogoDao.getById(59)),LocalDate.of(2024,10,29), LocalDate.of(2024,11,15));
//        prestitoDao.save(p9);
//        Prestito p10 = new Prestito(utenteDao.getById(71), Arrays.asList(catalogoDao.getById(56)),LocalDate.of(2025,1,19), LocalDate.of(2025,1,24));
//        prestitoDao.save(p10);


         // RICERCA TRAMITE ID DI UN ELEMENTO NEL CATALOGO E SUA ELIMINAZIONE (secondo punto esercitazione) 👍👍👍👍
//       Catalogo catalogo = catalogoDao.getById(47);
//       catalogoDao.delete(catalogo);


        // RICERCA TRAMITE ISBN    (terzo punto esercitazione)    👍👍👍👍
        System.out.println("TERZO PUNTO (RICERCA TRAMITE ISBN)");
        List<Catalogo> catalogoRicerca = catalogoDao.ricercaXISBN();
        catalogoRicerca.forEach(System.out::println);

        // RICERCA PER ANNO PUBBLICAZIONE (Quarto punto esercitazione)     👍👍👍👍
        System.out.println("QUARTO PUNTO (RICERCA PER ANNO DI PUBBLICAZIONE)");
        List<Catalogo> catalogoRicercXAnno = catalogoDao.ricercaXAnnoPubblicazione();
        catalogoRicercXAnno.forEach(System.out::println);

        // RICERCA PER AUTORE (Quinto punto esercitazione)         👍👍👍👍
        System.out.println("QUINTO PUNTO (RICERCA PER AUTORE)");
        List<Catalogo> catalogoRicXAutore = catalogoDao.ricercaXAutore();
        catalogoRicXAutore.forEach(System.out::println);

        // RICERCA PER TITOLO O UNA PARTE DI ESSO (Sesto punto esercitazione) 👍👍👍👍
        System.out.println("SESTO PUNTO (RICERCA PER TITOLO O UNA PARTE DI ESSO");
        List<Catalogo> catalogoRicXTitolo = catalogoDao.ricercaXTitoloOParte();
        catalogoRicXTitolo.forEach(System.out::println);

        // RICERCA PER GLI ELEMENTI ATTUALMENTE IN PRESTITO DATO UN NUMERO DI TESSERA UTENTE (Settimo punto esercitazione)
        System.out.println("SETTIMO PUNTO (CERCA GLI ELEM ATTUALMENTE IN PRESTITO DATO UN NUMERO DI TESSERA UTENTE");




    }
}
