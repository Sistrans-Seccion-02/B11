package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CuentaHabitacion")

public class CuentaHabitacion
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "CheckIn", referencedColumnName = "CheckIn")
    private RHPK CheckIn;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    @ManyToOne
    @JoinColumn(name = "num_hab", referencedColumnName = "num_hab")
    private Habitacion num_hab;

    public CuentaHabitacion()
    {;}

    public CuentaHabitacion(RHPK CheckIn, Hotel id_Hotel, Habitacion num_hab)
    {
        this.CheckIn=CheckIn;
        this.id_Hotel=id_Hotel;
        this.num_hab=num_hab;
    }

    public Integer getId()
    {
        return id;
    }

    public RHPK getCheckIn()
    {
        return CheckIn;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Habitacion getHab()
    {
        return num_hab;
    }

    public void setRHPK(RHPK CheckIn)
    {
        this.CheckIn=CheckIn;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setHabitacion(Habitacion num_hab)
    {
        this.num_hab=num_hab;
    }

    public void setId(Integer id)
    {
        this.id=id;
    }
}