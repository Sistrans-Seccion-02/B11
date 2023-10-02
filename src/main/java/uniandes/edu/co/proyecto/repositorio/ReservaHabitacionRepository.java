package uniandes.edu.co.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.ReservaHabitacion;

@Repository
public interface ReservaHabitacionRepository extends JpaRepository<ReservaHabitacion, Long> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM ReservaHabitacion WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc AND CheckIn=:CheckIn",nativeQuery = true)
    ReservaHabitacion find(@Param("id_Cliente")int id,@Param("TipoDoc") String TipoDoc,@Param("CheckIn") Date CheckIn);
    
    // Actualizar una ReservaHabitacion
    @Modifying
    @Transactional
    @Query(value = "UPDATE ReservaHabitacion SET CheckOut=:CheckOut, Plan=:Plan, NumPersonas=:NumPersonas, num_hab=:id, id_Hotel=:id_Hotel WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc AND CheckIn=:CheckIn", nativeQuery = true)
    void updateReservaHabitacion(@Param("id") Integer num_hab,@Param("id_Hotel") String id_Hotel,  @Param("CheckIn") Date CheckIn, @Param("NumPersonas") Integer NumPersonas, @Param("CheckOut") Date CheckOut,@Param("Plan") String Plan, @Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);
    
    // Eliminar una ReservaHabitacion
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM ReservaHabitacion WHERE id_Cliente=:id_Cliente AND TipoDoc=:TipoDoc AND CheckIn=:CheckIn",nativeQuery = true)
    ReservaHabitacion delete(@Param("id_Cliente")int id,@Param("TipoDoc") String TipoDoc,@Param("CheckIn") Date CheckIn);

    // Crea un nueva ReservaHabitacioon
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO ReservaHabitacion (num_hab, id_Hotel, CheckIn, CheckOut, NumPersonas, Plan, id_Cliente, TipoDoc) VALUES(:id, :id_Hotel, :CheckIn, :CheckOut, :NumPersonas, :Plan, :id_Clientem :TipoDoc)",nativeQuery = true)
    void createReservaHabitacion(@Param("id") Integer num_hab,@Param("id_Hotel") String id_Hotel,@Param("CheckIn") Date CheckIn, @Param("CheckOut") Date CheckOut, @Param("NumPersonas") Integer NumPersonas, @Param("Plan") String Plan, @Param("id_Cliente") Integer id_Cliente, @Param("TipoDoc") String TipoDoc);
    
    // Consultar todos las ReservaHabitaciones
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM ReservaHabitacion", nativeQuery = true)
    List<ReservaHabitacion> findAll();
}