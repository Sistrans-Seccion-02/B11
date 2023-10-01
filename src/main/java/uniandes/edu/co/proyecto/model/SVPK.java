package uniandes.edu.co.proyecto.model;
import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SVPK implements Serializable
{
    @ManyToOne
    @JoinColumn(name="id_Hotel", referencedColumnName = "Id")
    private Hotel id_Hotel;

    @ManyToOne
    @JoinColumn(name="id_CH", referencedColumnName = "Id")
    private CuentaHabitacion id_CH;

    private String Articulo;
    private Integer Costo;

    public SVPK()
    {
        super();
    }

    public SVPK(Hotel id_Hotel,CuentaHabitacion id_CH,String Articulo,Integer Costo)
    {
        super();
        this.id_Hotel=id_Hotel;
        this.id_CH=id_CH;
        this.Articulo=Articulo;
        this.Costo=Costo;
    }

    public Hotel getIdHotel()
    {
        return id_Hotel;
    }

    public CuentaHabitacion getCHId()
    {
        return id_CH;
    }

    public String getArticulo()
    {
        return Articulo;
    }

    public Integer getCosto()
    {
        return Costo;
    }

    public void setId_Hotel(Hotel id_Hotel)
    {
        this.id_Hotel=id_Hotel;
    }

    public void setId_CH(CuentaHabitacion id_CH)
    {
        this.id_CH=id_CH;
    }

    public void setArticulo(String Articulo)
    {
        this.Articulo=Articulo;
    }

    public void setCosto(Integer Costo)
    {
        this.Costo=Costo;
    }
}