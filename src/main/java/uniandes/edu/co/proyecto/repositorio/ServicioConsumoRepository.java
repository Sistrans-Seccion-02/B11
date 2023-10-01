package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
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
}

