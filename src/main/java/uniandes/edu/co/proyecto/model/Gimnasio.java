package uniandes.edu.co.proyecto.model;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Gimnasio")

public class Gimnasio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    private Integer Capacidad;
    private Integer Maquinas;
    private Date HorarioApertura;
    private Date HorarioCierre;

    public Gimnasio()
    {;}

    public Gimnasio(Hotel id_Hotel, Integer Capacidad, Integer Maquinas, Date HorarioApertura, Date HorarioCierre)
    {
        this.id_Hotel=id_Hotel;
        this.Capacidad=Capacidad;
        this.HorarioApertura=HorarioApertura;
        this.HorarioCierre=HorarioCierre;
        this.Maquinas=Maquinas;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getCapacidad()
    {
        return Capacidad;
    }

    public Integer getMaquinas()
    {
        return Maquinas;
    }

    public Date getHoraAp()
    {
        return HorarioApertura;
    }

    public Date getHoraCi()
    {
        return HorarioCierre;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setId(Integer id)
    {
        this.id=id;
    }

    public void setCapacidad(Integer Capacidad)
    {
        this.Capacidad=Capacidad;
    }

    public void setMaquinas(Integer Maquinas)
    {
        this.Maquinas=Maquinas;
    }

    public void setHoraAp(Date HorarioApertura)
    {
        this.HorarioApertura=HorarioApertura;
    }

    public void setHoraCi(Date HorarioCierre)
    {
        this.HorarioCierre=HorarioCierre;
    }
    
}
