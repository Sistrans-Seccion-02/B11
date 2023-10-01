package uniandes.edu.co.proyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "LlegadaCliente")
public class LlegadaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "FechaLlegada", nullable = false)
    private Date fechaLlegada;

    @ManyToOne
    @JoinColumn(name = "ReservaHabitacionId", referencedColumnName = "Id", nullable = false)
    private ReservaHabitacion reservaHabitacion;

    @ManyToOne
    @JoinColumn(name = "RecepcionistaId", referencedColumnName = "Id", nullable = false)
    private Personal recepcionista;

    // Constructor, getters y setters

    public LlegadaCliente() {
    }

    public LlegadaCliente(Date fechaLlegada, ReservaHabitacion reservaHabitacion, Personal recepcionista) {
        this.fechaLlegada = fechaLlegada;
        this.reservaHabitacion = reservaHabitacion;
        this.recepcionista = recepcionista;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public ReservaHabitacion getReservaHabitacion() {
        return reservaHabitacion;
    }

    public void setReservaHabitacion(ReservaHabitacion reservaHabitacion) {
        this.reservaHabitacion = reservaHabitacion;
    }

    public Personal getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Personal recepcionista) {
        this.recepcionista = recepcionista;
    }
}

