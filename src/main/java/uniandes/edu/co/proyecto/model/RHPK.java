package uniandes.edu.co.proyecto.model;
import java.io.Serializable;

import org.apache.commons.lang3.time.DateFormatUtils;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class RHPK implements Serializable
{
    @ManyToOne
    @JoinColumn(name="id_Hotel", referencedColumnName="id")
    private Hotel id_Hotel;

    @ManyToOne
    @JoinColumn(name="num_Hab", referencedColumnName="num_hab")
    private Habitacion num_hab;

    private DateFormatUtils CheckIn;
    private DateFormatUtils CheckOut;
    private Integer NumPer;
    private String Plan;

    public RHPK()
    {
        super();
    }

    public RHPK(DateFormatUtils checkIn2, Hotel id_Hotel, Habitacion num_hab, DateFormatUtils  checkOut2, Integer NumPer, String Plan)
    {
        super();
        this.id_Hotel=id_Hotel;
        this.num_hab=num_hab;
        this.CheckIn=checkIn2;
        this.CheckOut=checkOut2;
        this.NumPer=NumPer;
        this.Plan=Plan;
    }

    public RHPK(DateFormatUtils checkIn2, Hotel hotel, Habitacion habitacion, DateFormatUtils checkOut2,
            Integer numPer2, String plan2) {
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Habitacion getHab()
    {
        return num_hab;
    }

    public DateFormatUtils getCheckIn()
    {
        return CheckIn;
    }

    public DateFormatUtils getCheckOut()
    {
        return CheckOut;
    }

    public Integer getNumPer()
    {
        return NumPer;
    }

    public String getPlan()
    {
        return Plan;
    }

    public void setHotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setHabitacion(Habitacion num_hab)
    {
        this.num_hab=num_hab;
    }

    public void setCheckIn(DateFormatUtils CheckIn)
    {
        this.CheckIn=CheckIn;
    }

    public void setCheckOut(DateFormatUtils CheckOut)
    {
        this.CheckOut=CheckOut;
    }

    public void setNumPer(Integer NumPer)
    {
        this.NumPer=NumPer;
    }

    public void setPlan(String Plan)
    {
        this.Plan=Plan;
    }
}