package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.SalidaCliente;

@Repository
public interface SalidaClienteRepository extends JpaRepository<SalidaCliente, Long> {

    // Consultar la salida de un cliente por ID de la reserva de habitación
    SalidaCliente findByReservaHabitacionId(Long reservaHabitacionId);

    // Registrar la salida de un cliente
    SalidaCliente save(SalidaCliente salidaCliente);

    // Actualizar la salida de un cliente
    SalidaCliente saveAndFlush(SalidaCliente salidaCliente);

    // Borrar la salida de un cliente por ID
    void deleteById(Long id);
}
