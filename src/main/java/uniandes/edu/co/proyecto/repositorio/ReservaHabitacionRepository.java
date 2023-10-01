import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import uniandes.edu.co.proyecto.model.ReservaHabitacion;

@Repository
public interface ReservaHabitacionRepository extends JpaRepository<ReservaHabitacion, Integer> {
    
    // Consultar reserva de habitación por ID
    ReservaHabitacion findById(int id);

    // Consultar todas las reservas de habitación
    List<ReservaHabitacion> findAll();

    // Registrar una nueva reserva de habitación
    ReservaHabitacion save(ReservaHabitacion reservaHabitacion);

    // Actualizar una reserva de habitación existente
    ReservaHabitacion saveAndFlush(ReservaHabitacion reservaHabitacion);

    // Eliminar una reserva de habitación por ID
    void deleteById(Long id);
    
    // Consultar el plan de consumo de una reserva de habitación por ID de reserva
    <Plan> Plan findPlanByReservaHabitacionId(int reservaHabitacionId);

    // Actualizar el plan de consumo de una reserva de habitación por ID de reserva
    @Modifying
    @Transactional
    @Query("UPDATE ReservaHabitacion r SET r.planConsumo = :planConsumo WHERE r.id = :reservaHabitacionId")
    void updatePlanConsumoByReservaHabitacionId(@Param("reservaHabitacionId") Long reservaHabitacionId, @Param("planConsumo") Plan plan);
}
