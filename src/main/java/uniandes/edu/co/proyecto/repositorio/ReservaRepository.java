import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Cliente;
import uniandes.edu.co.proyecto.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Reserva WHERE FechaInicio=:FechaInicio AND Salon=:Salon",nativeQuery = true)
    Reserva find(@Param("FechaInicio")Date FechaInicio,@Param("Salon") Integer Salon);
    
    // Actualizar una Reserva
    @Modifying
    @Transactional
    @Query(value = "UPDATE Reserva SET Duracion=:Duracion, Costo=:Costo, id_Cliente=:id_Cliente, TipoDoc=:TipoDoc WHERE FechaInicio=:FechaInicio AND Salon=Salon", nativeQuery = true)
    void updateReserva(@Param("FechaInicio") Date FechaInicio,@Param("Duracion") Integer Duracion,  @Param("Costo") Integer Costo, @Param("Salon") Integer Salon, @Param("id_Cliente") Integer id_Cliente,@Param("TipoDoc") String TipoDoc, @Param("cargaHabitacion") boolean cargaHabitacion);
    
    // Eliminar una Reserva
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Reserva WHERE FechaInicio=:FechaInicio AND Salon=:Salon",nativeQuery = true)
    Reserva delete(@Param("FechaInicio")Date FechaInicio,@Param("Salon") Integer Salon);

    // Crea un nueva Reserva
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Reserva (FechaInicio, Duracion, Costo, Salon, id_Cliente, TipoDoc, cargaHabitacion) VALUES(:FechaInicio, :Duracion, :Costo, :Salon, :id_Cliente, :TipoDoc, :cargaHabitacion)",nativeQuery = true)
    void createReserva(@Param("FechaInicio") Date FechaInicio,@Param("Duracion") Integer Duracion,  @Param("Costo") Integer Costo, @Param("Salon") Integer Salon, @Param("id_Cliente") Integer id_Cliente,@Param("TipoDoc") String TipoDoc, @Param("cargaHabitacion") boolean cargaHabitacion);
    
    // Consultar todos las Reservas
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Reserva", nativeQuery = true)
    List<Reserva> findAll();
}
