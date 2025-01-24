package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "prestiti")
public class Prestito {

    @Id
    @GeneratedValue
    private long id_prestito;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @ManyToMany
    @JoinTable(name = "prestito_per_elemento_nel_catalogo",
    joinColumns = @JoinColumn(name = "prestito_id"),
    inverseJoinColumns = @JoinColumn(name = "catalogo_id"))
    private List<Catalogo> elemento_prestato;
    private LocalDate data_inizio_prestito;
    private LocalDate data_restituzione_prevista;
    private LocalDate data_restituzione_effettiva;

    public Prestito() {
    }

    public Prestito(Utente utente, List<Catalogo> elemento_prestato, LocalDate data_inizio_prestito, LocalDate data_restituzione_prevista, LocalDate data_restituzione_effettiva) {
        this.utente = utente;
        this.elemento_prestato = elemento_prestato;
        this.data_inizio_prestito = data_inizio_prestito;
        this.data_restituzione_prevista = data_restituzione_prevista;
        this.data_restituzione_effettiva = data_restituzione_effettiva;
    }

    public long getId_prestito() {
        return id_prestito;
    }

    public void setId_prestito(long id_prestito) {
        this.id_prestito = id_prestito;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public List<Catalogo> getElemento_prestato() {
        return elemento_prestato;
    }

    public void setElemento_prestato(List<Catalogo> elemento_prestato) {
        this.elemento_prestato = elemento_prestato;
    }

    public LocalDate getData_inizio_prestito() {
        return data_inizio_prestito;
    }

    public void setData_inizio_prestito(LocalDate data_inizio_prestito) {
        this.data_inizio_prestito = data_inizio_prestito;
    }

    public LocalDate getData_restituzione_prevista() {
        return data_restituzione_prevista;
    }

    public void setData_restituzione_prevista(LocalDate data_restituzione_prevista) {
        this.data_restituzione_prevista = data_restituzione_prevista;
    }

    public LocalDate getData_restituzione_effettiva() {
        return data_restituzione_effettiva;
    }

    public void setData_restituzione_effettiva(LocalDate data_restituzione_effettiva) {
        this.data_restituzione_effettiva = data_restituzione_effettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id_prestito=" + id_prestito +
                ", utente=" + utente +
                ", elemento_prestato=" + elemento_prestato +
                ", data_inizio_prestito=" + data_inizio_prestito +
                ", data_restituzione_prevista=" + data_restituzione_prevista +
                ", data_restituzione_effettiva=" + data_restituzione_effettiva +
                '}';
    }
}
