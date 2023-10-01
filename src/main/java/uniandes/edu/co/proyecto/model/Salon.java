package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Salon")

public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_salon;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    private Integer Capacidad;
    private String TipoSalon;
    private Integer CostEquip;

    public Salon()
    {;}

    public Salon(Hotel id_Hotel, Integer Capacidad, String TipoSalon, Integer CostEquip)
    {
        this.id_Hotel=id_Hotel;
        this.Capacidad=Capacidad;
        this.TipoSalon=TipoSalon;
        this.CostEquip=CostEquip;
    }

    public Integer getId()
    {
        return id_salon;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Integer getCapacidad()
    {
        return Capacidad;
    }

    public String getTipoSalon()
    {
        return TipoSalon;
    }

    public Integer getCostEquip()
    {
        return CostEquip;
    }

    public void setId(Integer id)
    {
        this.id_salon=id;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setCapacidad(Integer Capacidad)
    {
        this.Capacidad=Capacidad;
    }

    public void setTipoSalon(String TipoSalon)
    {
        this.TipoSalon=TipoSalon;
    }

    public void setCostEquip(Integer CostEquip)
    {
        this.CostEquip=CostEquip;
    }
}
