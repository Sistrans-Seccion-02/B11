package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cuenta")

public class Cuenta {
    @ManyToOne
    @JoinColumn(name = "sc_id", referencedColumnName = "sc_id")
    private ServicioConsumo sc_id;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel")
    private Hotel id_Hotel;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente id_Cliente;
    private Date Fecha;
    private boolean CargaHabitacion;

    public Cuenta()
    {;}

    public Cuenta(ServicioConsumo sc_id, Hotel id_Hotel, Cliente id_cliente, Date Fecha, boolean CargaHabitacion)
    {
        this.sc_id=sc_id;
        this.id_Hotel=id_Hotel;
        this.id_Cliente=id_cliente;
        this.Fecha=Fecha;
        this.CargaHabitacion=CargaHabitacion;
    }

    public ServicioConsumo getSc()
    {
        return sc_id;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Cliente getCliente()
    {
        return id_Cliente;
    }

    public Date getFecha()
    {
        return Fecha;
    }

    public boolean getCarHab()
    {
        return CargaHabitacion;
    }

    public void setSc(ServicioConsumo sc_id)
    {
        this.sc_id=sc_id;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setCliente(Cliente id_Cliente)
    {
        this.id_Cliente=id_Cliente;
    }

    public void setFecha(Date Fecha)
    {
        this.Fecha=Fecha;
    }

    public void setCarHab(boolean CargaHabitacion)
    {
        this.CargaHabitacion=CargaHabitacion;
    }
}
