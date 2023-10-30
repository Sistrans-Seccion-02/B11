package uniandes.edu.co.proyecto.repositorio;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.ServicioConsumo;

@Repository
public interface ServicioConsumoRepository extends JpaRepository<ServicioConsumo, Integer> {

        // Consultar servicio por ID
    ServicioConsumo findById(int id);

    // Consultar todos los servicios
    List<ServicioConsumo> findAll();

    // Registrar un nuevo servicio
    ServicioConsumo save(ServicioConsumo servicioConsumo);

    // Actualizar un servicio existente
    ServicioConsumo saveAndFlush(ServicioConsumo servicio);

    // Eliminar un servicio por ID
    void deleteById(Long id);

    // RFC1 - Mostrar el dinero recolectado por servicios en cada habitación en el último año corrido
    @Query("SELECT numHabitacion, SUM(montoTotal) as dinero_recolectado " +
           "FROM ServicioConsumo " +
           "WHERE fechaConsumo BETWEEN TRUNC(SYSDATE) - 365 AND TRUNC(SYSDATE) " +
           "GROUP BY numHabitacion" +
           "ORDER BY dinero_recolectado DESC"
           )
    List<Object[]> findDineroRecolectadoPorHabitacion(@Param("anioAnterior") LocalDate anioAnterior, @Param("anioActual") LocalDate anioActual);
}

