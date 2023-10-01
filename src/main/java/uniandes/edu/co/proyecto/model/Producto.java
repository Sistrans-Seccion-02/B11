package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Producto")

public class Producto {
    @ManyToOne
    @JoinColumn(name="sc_id", referencedColumnName = "sc_id")
    private ServicioConsumo sc_id;
    @ManyToOne
    @JoinColumn(name="num_hab", referencedColumnName = "num_hab")
    private Habitacion num_hab;
    @ManyToOne
    @JoinColumn(name="id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    private String nombre;
    private String Descripcion;

    public Producto()
    {;}

    public Producto(ServicioConsumo sc_id, Habitacion num_hab, Hotel id_Hotel, String nombre, String Descripcion)
    {
        this.sc_id=sc_id;
        this.id_Hotel=id_Hotel;
        this.num_hab=num_hab;
        this.nombre=nombre;
        this.Descripcion=Descripcion;
    }

    public ServicioConsumo getSC()
    {
        return sc_id;
    }

    public Habitacion getNumHab()
    {
        return num_hab;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public void setSC(ServicioConsumo sc_id)
    {
        this.sc_id=sc_id;
    }

    public void setNumHab(Habitacion  num_hab)
    {
        this.num_hab=num_hab;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void setDesc(String Descripcion)
    {
        this.Descripcion=Descripcion;
    }
}
