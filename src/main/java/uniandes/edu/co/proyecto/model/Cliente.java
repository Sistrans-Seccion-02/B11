package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cliente")

public class Cliente {
    @OneToOne
    @JoinColumns({
        @JoinColumn(name = "id_Cliente", referencedColumnName = "id"),
        @JoinColumn(name = "TipoDoc", referencedColumnName = "TipoDoc")})
    private Usuario id_Cliente;
    private Usuario TipoDoc;

    public Cliente()
    {;}

    public Cliente(Usuario id_Cliente, Usuario TipoDoc, CuentaHabitacion CuentaHabitacion)
    {
        this.id_Cliente=id_Cliente;
        this.TipoDoc=TipoDoc;
        this.id_CuentaHab=CuentaHabitacion;
    }

    public Usuario getIdCliente()
    {
        return id_Cliente;
    }

    public Usuario getTipoDoc()
    {
        return TipoDoc;
    }

    public CuentaHabitacion getCuentaHab()
    {
        return id_CuentaHab;
    }

    public void setIdCliente(Usuario id_Cliente)
    {
        this.id_Cliente=id_Cliente;
    }

    public void setTipoDoc(Usuario TipoDoc )
    {
        this.TipoDoc=TipoDoc;
    }

    public void setCuentaHab(CuentaHabitacion CuentaHabitacion)
    {
        this.CuentaHabitacion=CuentaHabitacion;
    }
}
