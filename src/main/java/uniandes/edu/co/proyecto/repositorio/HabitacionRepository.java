package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
     
    // Consultar habitación y tipo de habitación por ID
    Habitacion findById(int id);

    // Consultar todos los tipos de habitación y habitaciones
    List<Habitacion> findAll();

    // Registrar un nuevo tipo de habitación y una nueva habitación
    Habitacion save(Habitacion habitacion);

    // Actualizar un tipo de habitación y una habitación existente
    Habitacion saveAndFlush(Habitacion habitacion);

    // Eliminar un tipo de habitación y una habitación por ID
    void deleteById(int id);
}
