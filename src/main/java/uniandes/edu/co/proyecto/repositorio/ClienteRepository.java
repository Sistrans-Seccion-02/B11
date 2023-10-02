import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Crear cliente
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Usuario (Di, TipoDoc, Nombre, Correo) VALUES (:id_usuario,:TipoDoc,:Nombre,:Correo)", nativeQuery = true) 
    @Query(value = "INSERT INTO Cliente (id_Cliente, TipoDoc) VALUES (:id_Usuario,:TipoDoc)", nativeQuery = true)
    void createCliente(@Param("id_Usuario") Integer Di, @Param("TipoDoc") String TipoDoc, @Param("Nombre") String Nombre, @Param("Correo") String Correo);
    // Consultar un Cliente
    @Query(value = "SELECT * FROM Cliente WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc", nativeQuery = true)
    Cliente findCliente(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);

    // Eliminar un Cliente
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Usuario WHERE Di=:id_Cliente AND TipoDoc=:TipoDoc", nativeQuery = true)
    Cliente deleteCliente(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);
    
    // Consultar una reserva de habitacion de un cliente
    @Query(value = "SELECT * FROM ReservaHabitacion WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc AND CheckIn=:CheckIn", nativeQuery = true)
    ReservaHabitacion findBooking(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc, @Param("CheckIn") Date CheckIn);

    // Consultar todas las reservas de habitación de un cliente
    @Query(value = "SELECT * FROM ReservaHabitacion WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc", nativeQuery = true)
    List<ReservaHabitacion> findAllRoomBookings(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);
    
     // Consultar todas las reservas de un cliente
    @Query(value = "SELECT * FROM Reserva WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc", nativeQuery = true)
    List<ReservaHabitacion> findAllBookings(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);

    // Consultar el plan de consumo de una reserva de habitación por ID de reserva
    @Query(value = "SELECT Plan FROM ReservaHabitacion WHERE ReservaHabitacion.id_Cliente=:id_Cliente AND ReservaHabitacion.TipoDoc=:TipoDoc")
    String findPlanByClienteId(@Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);

    // Actualizar el plan de consumo de una reserva de habitación por ID de reserva
    @Modifying
    @Transactional
    @Query(value = "UPDATE ReservaHabitacion r SET r.plan = :planConsumo WHERE r.id_Cliente = :ClienteId AND r.TipoDoc=:TipoDoc", nativeQuery = true)
    void updatePlanByClienteId(@Param("ClienteId") Integer ClienteId, @Param("TipoDoc") String TipoDoc, @Param("planConsumo") Plan plan);
}