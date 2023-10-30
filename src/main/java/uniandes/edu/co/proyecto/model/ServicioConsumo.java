package uniandes.edu.co.proyecto.model;

import org.apache.commons.lang3.time.DateFormatUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ServicioConsumo")

public class ServicioConsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sc_id;
    @ManyToOne
    @JoinColumn(name = "id_Hotel", referencedColumnName = "id_Hotel") 
    private Hotel id_Hotel;
    private String Nombre;
    private Integer Capacidad;
    private DateFormatUtils HorarioApertura;
    private DateFormatUtils HorarioCierre;
    private Habitacion idHabitacion;
    private Float montoTotal;
    private String TipoMusica;
    private DateFormatUtils fechaConsumo;
    private Float precio;
    private Cliente idCliente;
    private String TipoTienda;
    private String TipoComida;

public ServicioConsumo() {
}

public ServicioConsumo(Hotel id_Hotel, String Nombre, Integer Capacidad, DateFormatUtils HorarioApertura, DateFormatUtils HorarioCierre, Habitacion idHabitacion, Float montoTotal, DateFormatUtils fechaConsumo, Float precio, Cliente idCliente, String TipoComida, String TipoMusica, String TipoTienda) {
    this.id_Hotel = id_Hotel;
    this.Capacidad = Capacidad;
    this.Nombre = Nombre;
    this.HorarioApertura = HorarioApertura;
    this.HorarioCierre = HorarioCierre;
    this.TipoComida = TipoComida;
    this.idHabitacion = idHabitacion;
    this.montoTotal = montoTotal;
    this.fechaConsumo = fechaConsumo;
    this.precio = precio;
    this.idCliente = idCliente;
    this.TipoMusica = TipoMusica;
    this.TipoTienda = TipoTienda;
}

public Integer getId() {
    return sc_id;
}

public Hotel getHotel() {
    return id_Hotel;
}

public String getNombre() {
    return Nombre;
}

public Integer getCapacidad() {
    return Capacidad;
}

public DateFormatUtils getHorarioApertura() {
    return HorarioApertura;
}

public DateFormatUtils getHorarioCierre() {
    return HorarioCierre;
}

public Habitacion getHabitacion() {
    return idHabitacion;
}

public Float getMontoTotal() {
    return montoTotal;
}

public String getTipoMusica() {
    return TipoMusica;
}

public String getTipoTienda() {
    return TipoTienda;
}

public String getTipoComida() {
    return TipoComida;
}

public DateFormatUtils getFechaConsumo() {
    return fechaConsumo;
}

public Float getPrecio() {
    return precio;
}

public Cliente getCliente() {
    return idCliente;
}

public void setId(Integer id) {
    this.sc_id = id;
}

public void setHotel(Hotel id_Hotel) {
    this.id_Hotel = id_Hotel;
}

public void setNombre(String Nombre) {
    this.Nombre = Nombre;
}

public void setCapacidad(Integer Capacidad) {
    this.Capacidad = Capacidad;
}

public void setHorarioApertura(DateFormatUtils HorarioApertura) {
    this.HorarioApertura = HorarioApertura;
}

public void setHorarioCierre(DateFormatUtils HorarioCierre) {
    this.HorarioCierre = HorarioCierre;
}

public void setHabitacion(Habitacion idHabitacion) {
    this.idHabitacion = idHabitacion;
}

public void setMontoTotal(Float montoTotal) {
    this.montoTotal = montoTotal;
}

public void setTipoMusica(String TipoMusica) {
    this.TipoMusica = TipoMusica;
}

public void setTipoTienda(String TipoTienda) {
    this.TipoTienda = TipoTienda;
}

public void setTipoComida(String TipoComida) {
    this.TipoComida = TipoComida;
}

public void setFechaConsumo(DateFormatUtils fechaConsumo) {
    this.fechaConsumo = fechaConsumo;
}

public void setPrecio(Float precio) {
    this.precio = precio;
}

public void setCliente(Cliente idCliente) {
    this.idCliente = idCliente;
}

}
