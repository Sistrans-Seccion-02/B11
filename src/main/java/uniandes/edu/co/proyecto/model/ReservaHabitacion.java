package uniandes.edu.co.proyecto.model;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ReservaHabitacion")

public class ReservaHabitacion
{
    @EmbeddedId
    private RHPK pk;

    public ReservaHabitacion() {
        ;
    }

    public ReservaHabitacion(Date CheckIn, Hotel Hotel, Habitacion Habitacion, Date CheckOut, Integer NumPer, String Plan) {
        super();
        this.pk = new RHPK(CheckIn, Hotel, Habitacion, CheckOut, NumPer, Plan);
    }

    public RHPK getPk() {
        return pk;
    }

    public void setPk(RHPK pk) {
        this.pk = pk;
    }
}