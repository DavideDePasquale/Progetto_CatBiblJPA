package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "cataloghi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_elemento")
public abstract class Catalogo {

    @Id
    @GeneratedValue
    private long cod_ISBN;
    @Column(nullable = false)
    private String titolo;
    @Column(nullable = false)
    private int anno_pubblicazione;
    @Column(nullable = false)
    private int n_pagine;


    public Catalogo() {
    }

    public Catalogo(String titolo, int anno_pubblicazione, int n_pagine) {
        this.titolo = titolo;
        this.anno_pubblicazione = anno_pubblicazione;
        this.n_pagine = n_pagine;
    }

    public long getCod_ISBN() {
        return cod_ISBN;
    }

    public void setCod_ISBN(long cod_ISBN) {
        this.cod_ISBN = cod_ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno_pubblicazione() {
        return anno_pubblicazione;
    }

    public void setAnno_pubblicazione(int anno_pubblicazione) {
        this.anno_pubblicazione = anno_pubblicazione;
    }

    public int getN_pagine() {
        return n_pagine;
    }

    public void setN_pagine(int n_pagine) {
        this.n_pagine = n_pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "cod_ISBN=" + cod_ISBN +
                ", titolo='" + titolo + '\'' +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", n_pagine=" + n_pagine +
                '}';
    }
}
