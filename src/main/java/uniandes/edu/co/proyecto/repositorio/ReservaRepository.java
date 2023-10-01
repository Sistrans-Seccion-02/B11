import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Cliente;
import uniandes.edu.co.proyecto.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    
    // Consultar reserva de alojamiento por ID
    Reserva findById(Long id);

    // Consultar todas las reservas de alojamiento
    List<Reserva> findAll();

    // Registrar una nueva reserva de alojamiento
    Reserva save(Reserva reservaAlojamiento);

    // Actualizar una reserva de alojamiento existente
    Reserva saveAndFlush(Reserva reservaAlojamiento);

    // Eliminar una reserva de alojamiento por ID
    void deleteById(Long id);
    
    // Consultar las reservas de alojamiento realizadas por un cliente específico
    List<Reserva> findByCliente(Cliente cliente);
}
