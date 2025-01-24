package org.example.entities;


import org.example.Enumeration.TipoGenere;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "libri")
public class Libro extends Catalogo {

    @Column(nullable = false)
    private String autore;
    @Enumerated(EnumType.STRING)
    private TipoGenere genere;

    public Libro() {
    }

    public Libro(String titolo, LocalDate anno_pubblicazione, int n_pagine, String autore, TipoGenere genere) {
        super(titolo, anno_pubblicazione, n_pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public TipoGenere getGenere() {
        return genere;
    }

    public void setGenere(TipoGenere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
