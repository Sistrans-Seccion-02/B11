package uniandes.edu.co.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class SalidaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reservaHabitacion_id")
    private ReservaHabitacion reservaHabitacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;

    // Otros campos y getters/setters

    // Constructor
    public SalidaCliente() {
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReservaHabitacion getReservaHabitacion() {
        return reservaHabitacion;
    }

    public void setReservaHabitacion(ReservaHabitacion reservaHabitacion) {
        this.reservaHabitacion = reservaHabitacion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
