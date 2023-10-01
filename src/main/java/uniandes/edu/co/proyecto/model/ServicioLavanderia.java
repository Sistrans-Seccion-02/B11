package uniandes.edu.co.proyecto.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ServicioLavanderia")

public class ServicioLavanderia
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private SVPK pk;

    public ServicioLavanderia() {
        ;
    }

    public ServicioLavanderia(Hotel id_hotel, CuentaHabitacion id_CH, String Articulo, Integer Costo ) {
        super();
        this.pk = new SVPK(id_hotel, id_CH, Articulo, Costo);
    }

    public SVPK getPk() {
        return pk;
    }

    public void setPk(SVPK pk) {
        this.pk = pk;
    }
}