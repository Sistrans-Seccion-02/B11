package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")

public class Usuario
{
    private Integer Di;
    private String TipoDoc;
    private String Nombre;
    private String Correo;

    public Usuario(){;}

    public Usuario(Integer Di, String TipoDoc, String Nombre, String Correo)
    {
        this.Di=Di;
        this.TipoDoc=TipoDoc;
        this.Nombre=Nombre;
        this.correo=Correo;
    }

    public Integer getDi()
    {
        return Di;
    }

    public String getTipoDoc()
    {
        return TipoDoc;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setDi(Integer Di)
    {
        this.Di = Di;
    }

    public void setTipoDoc(String TipoDoc)
    {
        this.TipoDoc = TipoDoc;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }

    public void setCorreo(String Correo)
    {
        this.Correo=Correo;
    }
}