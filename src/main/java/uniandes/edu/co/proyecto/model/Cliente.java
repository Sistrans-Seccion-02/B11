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
    @ManyToOne
    @JoinColumn(name = "id_CuentaHab", referencedColumnName = "id")
    private CuentaHabitacion id_CuentaHab;
}
