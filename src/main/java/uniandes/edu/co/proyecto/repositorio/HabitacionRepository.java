package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
     
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Habitacion WHERE num_hab=:id AND id_Hotel=:id_Hotel",nativeQuery = true)
    Habitacion find(@Param("id")int id,@Param("id_Hotel") Integer id_Hotel);
    
    // Actualizar una Habitacion
    @Modifying
    @Transactional
    @Query(value = "UPDATE Habitacion SET Descripcion=:Descripcion, TipoHabitacion=:TipoHabitacion WHERE Di=:id AND id_Hotel=:id_Hotel", nativeQuery = true)
    void updateHabitacion(@Param("id") Integer Di,@Param("id_Hotel") Integer id_Hotel,@Param("Descripcion") String Descripcion,@Param("TipoHabitacion") String TipoHabitacion);
    
    // Eliminar una Habitacion
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Habitacion WHERE Di=:Di AND id_Hotel=:id_Hotel",nativeQuery = true)
    void delete(@Param("Di") Integer Di, @Param("id_Hotel") Integer id_Hotel);

    // Crea un nueva Habitacioon
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Habitacion (Di, id_Hotel, Descripcion, TipoHabitacion) VALUES(:id, :id_Hotel, :Descripcion, :TipoHabitacion)",nativeQuery = true)
    void createHabitacion(@Param("id") Integer Di,@Param("id_Hotel") Integer id_Hotel,@Param("Descripcion") String Descripcion,@Param("TipoHabitacion") String TipoHabitacion);
    
    // Consultar todos las Habitaciones
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Habitacion", nativeQuery = true)
    List<Habitacion> findAll();
}
