package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Utencilio")

public class Utencilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_CuentaHab", referencedColumnName = "id")
    private CuentaHabitacion id_CuentaHab;
    private String Nombre;
    private Date FechaEntrega;
    private Date FechaDevolucion;
    private Integer Costo;

    public Utencilio()
    {;}

    public Utencilio(CuentaHabitacion id_CuentaHab, String Nombre, Date FechaEntrega, Date FechaDevolucion, Integer Costo)
    {
        this.Costo=Costo;
        this.FechaDevolucion=FechaDevolucion;
        this.FechaEntrega=FechaEntrega;
        this.Nombre=Nombre;
        this.id_CuentaHab=id_CuentaHab;
    }

    public Integer getId()
    {
        return id;
    }

    public CuentaHabitacion getCuentaHabitacion()
    {
        return id_CuentaHab;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public Date getFechaEn()
    {
        return FechaEntrega;
    }

    public Date getFechaDe()
    {
        return FechaDevolucion;
    }

    public Integer getCosto()
    {
        return Costo;
    }

    public void setId(Integer id)
    {
        this.id=id;
    }

    public void setCuentaHabitacion(CuentaHabitacion id_CuentaHab)
    {
        this.id_CuentaHab=id_CuentaHab;
    }

    public void setFechaEn(Date FechaEntrega)
    {
        this.FechaEntrega=FechaEntrega;
    }

    public void setFechaDe(Date FechaDevolucion)
    {
        this.FechaDevolucion=FechaDevolucion;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }

    public void setCosto(Integer Costo)
    {
        this.Costo=Costo;
    }
}
