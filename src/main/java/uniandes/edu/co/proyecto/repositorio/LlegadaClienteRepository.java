package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.LlegadaCliente;
import uniandes.edu.co.proyecto.model.ReservaHabitacion;

@Repository
public interface LlegadaClienteRepository extends JpaRepository<ReservaHabitacion, Long> {

    // Consultar la llegada de un cliente por el ID de la reserva de habitación
    LlegadaCliente findByReservaHabitacionId(Long reservaHabitacionId);

    // Registrar la llegada de un cliente
    LlegadaCliente save(LlegadaCliente llegadaCliente);

    // Actualizar la llegada de un cliente
    LlegadaCliente saveAndFlush(LlegadaCliente llegadaCliente);

    // Borrar la llegada de un cliente
    void deleteById(Long id);
}
