package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ServicioSpa")

public class ServicioSpa {
    @OneToOne
    @JoinColumn(name = "id_salon", referencedColumnName = "id")
    private Salon id_Salon;
    private String NombreServicio;
    private Integer Costo;

    public ServicioSpa()
    {;}

    public ServicioSpa(Salon id_salon, String NombreServicio, Integer Costo)
    {
        this.Costo=Costo;
        this.NombreServicio=NombreServicio;
        this.id_Salon=id_salon;
    }

    public Salon getSalon()
    {
        return id_Salon;
    }

    public String getNombreSer()
    {
        return NombreServicio;
    }

    public Integer getCosto()
    {
        return Costo;
    }

    public void setSalon(Salon id_salon)
    {
        this.id_Salon=id_salon;
    }

    public void setNombreSer(String Nombre)
    {
        this.NombreServicio=Nombre;
    }

    public void setCosto(Integer Costo)
    {
        this.Costo=Costo;
    }
}
