package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ServicioConsumo")

public class ServicioConsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sc_id;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    private String Nombre;
    private Integer Capacidad;
    private Date HorarioApertura;
    private Date HorarioCierre;
    private String TipoMusica;
    private String TipoTienda;
    private String TipoComida;

    public ServicioConsumo()
    {;}

    public ServicioConsumo(Hotel id_Hotel, String Nombre, Integer Capacidad, Date HorarioApertura, Date HorarioCierre, String TipoComida, String TipoMusica, String TipoTienda)
    {
        this.id_Hotel=id_Hotel;
        this.Capacidad=Capacidad;
        this.Nombre=Nombre;
        this.HorarioApertura=HorarioApertura;
        this.HorarioCierre=HorarioCierre;
        this.TipoComida=TipoComida;
        this.TipoMusica=TipoMusica;
        this.TipoTienda=TipoTienda;
    }

    public Integer getId()
    {
        return sc_id;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public Integer getCapacidad()
    {
        return Capacidad;
    }

    public Date getHorarioApertura()
    {
        return HorarioApertura;
    }

    public Date getHorarioCierre()
    {
        return HorarioCierre;
    }

    public String getTipoComida()
    {
        return TipoComida;
    }

    public String getTipoMusica()
    {
        return TipoMusica;
    }

    public String getTipoTienda()
    {
        return TipoTienda;
    }

    public void setId(Integer id)
    {
        this.sc_id=id;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }

    public void set(Integer Capacidad)
    {
        this.Capacidad=Capacidad;
    }

    public void setHorarioApertura(Date HorarioApertura)
    {
        this.HorarioApertura=HorarioApertura;
    }

    public void setHorarioCierre(Date HorarioCierre)
    {
        this.HorarioCierre=HorarioCierre;
    }

    public void setTipoComida(String TipoComida)
    {
        this.TipoComida=TipoComida;
    }

    public void setTipoMusica(String TipoMusica)
    {
        this.TipoMusica=TipoMusica;
    }

    public void setTipoTienda(String TipoTienda)
    {
        this.TipoTienda=TipoTienda;
    }
}
