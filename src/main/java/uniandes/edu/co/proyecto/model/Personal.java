package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Personal")
public class Personal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String TipoEmpl;

    public Personal(){;}

    public Personal(String tipoEmpl){
        this.TipoEmpl=tipoEmpl;
    }

    public Integer getId()
    {
        return id;
    }

    public String TipoEmpl()
    {
        return TipoEmpl;
    }

    public void setId(Integer Id)
    {
        this.id=Id;
    }

    public void setTipoEmpl(String TipoEmpl)
    {
        this.TipoEmpl = TipoEmpl;
    }
}