package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Reserva")

public class Reserva {
    @ManyToOne
    @JoinColumn(name = "id_salon", referencedColumnName = "id_salon")
    private Salon id_salon;
    @ManyToOne
    @JoinColumns(
        {@JoinColumn(name = "id_Cliente", referencedColumnName = "id_Cliente"),
        @JoinColumn(name = "TipoDoc", referencedColumnName = "TipoDoc")})
    private Cliente id_Cliente;
    private Cliente TipoDoc;
    private Date FechaInicio;
    private Integer Duracion;
    private Integer Costo;
    private boolean CargaHabitacion;

    public Reserva()
    {;}

    public Reserva(Salon id_salon, Cliente id_Cliente, Date FechaInicio, Integer Duracion, Integer Costo, boolean CargaHabitacion)
    {
        this.CargaHabitacion=CargaHabitacion;
        this.Costo=Costo;
        this.Duracion=Duracion;
        this.FechaInicio=FechaInicio;
        this.id_Cliente=id_Cliente;
        this.id_salon=id_salon;
    }

    public Salon getSalon()
    {
        return id_salon;
    }

    public Cliente getCliente()
    {
        return id_Cliente;
    }

    public Cliente getTipoDoc()
    {
        return TipoDoc;
    }

    public Date getFechaIn()
    {
        return FechaInicio;
    }

    public Integer getDuracion()
    {
        return Duracion;
    }

    public Integer getCosto()
    {
        return Costo;
    }

    public boolean getCargHab()
    {
        return CargaHabitacion;
    }

    public void setSalon(Salon id_salon)
    {
        this.id_salon=id_salon;
    }

    public void setCliente(Cliente id_Cliente)
    {
        this.id_Cliente=id_Cliente;
    }

    public void setTipoDoc(Cliente TipoDoc)
    {
        this.TipoDoc=TipoDoc;
    }

    public void setFechaIn(Date FechaInicio)
    {
        this.FechaInicio=FechaInicio;
    }

    public void setDuracion(Integer Duracion)
    {
        this.Duracion=Duracion;
    }

    public void setCosto(Integer Costo)
    {
        this.Costo=Costo;
    }

    public void setCargHab(boolean CargaHabitacion)
    {
        this.CargaHabitacion=CargaHabitacion;
    }
    
}
