package uniandes.edu.co.parranderos.modelo;
import java.io.Serializable;

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

    private Date CheckIn;
    private Date CheckOut;
    private Integer NumPer;
    private String Plan;

    public RHPK()
    {
        super();
    }

    public RHPK(Date CheckIn, Hotel id_Hotel, Habitacion num_hab, Date  CheckOut, Integer NumPer, String Plan)
    {
        super();
        this.id_Hotel=id_Hotel;
        this.num_hab=num_hab;
        this.CheckIn=CheckIn;
        this.CheckOut=CheckOut;
        this.NumPer=NumPer;
        this.Plan=Plan;
    }

    public Hotel getHotel()
    {
        return id_Hotel;
    }

    public Habitacion getHab()
    {
        return num_hab;
    }

    public Date getCheckIn()
    {
        return CheckIn;
    }

    public Date getCheckOut()
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

    public void setCheckIn(Date CheckIn)
    {
        this.CheckIn=CheckIn;
    }

    public void setCheckOut(Date CheckOut)
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