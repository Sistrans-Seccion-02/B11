package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {
     
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Cuenta WHERE Fecha=:Fecha AND ServicioConsumo=:sc AND id_Cliente=:idCliente AND TipoDoc=:TipoDoc",nativeQuery = true)
    Cuenta find(@Param("Fecha")Date Fecha,@Param("sc") Integer sc,@Param("id_Cliente")Integer id_Cliente, @Param("TipoDoc") String TipoDoc);
    
    // Actualizar una Cuenta
    @Modifying
    @Transactional
    @Query(value = "UPDATE Cuenta SET cargaHabitacion=:cargaHabitacion WHERE Fecha=:Fecha AND ServicioConsumo=:sc AND id_Cliente=:idCliente AND TipoDoc=:TipoDoc", nativeQuery = true)
    void updateCuenta(@Param("Fecha")Date Fecha,@Param("sc") Integer sc,@Param("id_Cliente")Integer id_Cliente, @Param("TipoDoc") String TipoDoc,@Param("cargaHabitacion") boolean cargaHabitacion);
    
    // Eliminar una Cuenta
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Cuenta WHERE Fecha=:Fecha AND ServicioConsumo=:sc AND id_Cliente=:idCliente AND TipoDoc=:TipoDoc",nativeQuery = true)
    Cuenta delete(@Param("Fecha")Date Fecha,@Param("sc") Integer sc,@Param("id_Cliente")Integer id_Cliente, @Param("TipoDoc") String TipoDoc);

    // Crea un nueva Cuentan
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Cuenta (Fecha, ServicioConsumo, id_Cliente, TipoDoc, CargaHabitacion) VALUES(:Fecha, :sc, :id_Cliente, :TipoDoc, :cargaHabitacion)",nativeQuery = true)
    void createCuenta(@Param("Fecha")Date Fecha,@Param("sc") Integer sc,@Param("id_Cliente")Integer id_Cliente, @Param("TipoDoc") String TipoDoc,@Param("cargaHabitacion") boolean cargaHabitacion);
    
    // Consultar todos las Cuentas de un cliente
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Cuenta WHERE id_Cliente=:idCliente AND TipoDoc=:TipoDoc ", nativeQuery = true)
    List<Cuenta> findAllFromCliente();

    // Consultar total de las Cuentas cargadas a la habitacion de un cliente
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Cuenta WHERE id_Cliente=:idCliente AND TipoDoc=:TipoDoc AND cargaHabitacion=true ", nativeQuery = true)
    List<Cuenta> findAllFromRoom();

    // Consultar todos las Cuentas
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Cuenta", nativeQuery = true)
    List<Cuenta> findAll();
}