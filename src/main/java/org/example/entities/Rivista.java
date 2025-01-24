package org.example.entities;

import org.example.Enumeration.TipoPubblicazione;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "riviste")
public class Rivista extends Catalogo{

    @Enumerated(EnumType.STRING)
    private TipoPubblicazione periodicita;

    public Rivista() {
    }

    public Rivista(String titolo, LocalDate anno_pubblicazione, int n_pagine, TipoPubblicazione periodicita) {
        super(titolo, anno_pubblicazione, n_pagine);
        this.periodicita = periodicita;
    }

    public TipoPubblicazione getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(TipoPubblicazione periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                '}';
    }
}
