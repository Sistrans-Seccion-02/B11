package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Habitacion")

public class Habitacion {
    private Integer num_hab;
    @ManyToOne
    @JoinColumn(name="id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    private String TipoHabitacion;
    private String Descripcion;

    public Habitacion()
    {;}

    public Habitacion(Integer num_hab, Hotel id_Hotel, String TipoHabitacion, String Descripcion)
    {
        this.num_hab=num_hab;
        this.id_Hotel=id_Hotel;
        this.TipoHabitacion=TipoHabitacion;
        this.Descripcion=Descripcion;
    }

    public Integer getNumHab()
    {
        return num_hab;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public String getTipoHab()
    {
        return TipoHabitacion;
    }

    public String getDesc()
    {
        return Descripcion;
    }

    public void setNumHab(Integer num_hab)
    {
        this.num_hab=num_hab;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setTipoHab(String TipoHabitacion)
    {
        this.TipoHabitacion=TipoHabitacion;
    }

    public void set(String Descripcion)
    {
        this.Descripcion=Descripcion;
    }
}
