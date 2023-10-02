package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;
    private String Nombre;
    private Integer CostInternet;

    public Bar(String Nombre, Integer CostInternet)
    {
        this.nombre=Nombre;
        this.CostInternet=CostInternet;
    }

    public Integer getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Integer getCostInternet()
    {
        return CostInternet;
    }

    public void setId(Integer id)
    {
        this.id=id;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }

    public void setCostInternet(Integer Cost)
    {
        this.CostInternet=Cost;
    }

    @Override
    public String toString()
    {
        return this.Nombre+"|"+this.CostInternet;
    }
}
