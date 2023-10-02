package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    // Consultar un usuario y su tipo por su ID
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM Usuario WHERE Di=:id AND TipoDoc=:TipoDoc",nativeQuery = true)
    Usuario find(@Param("id")int id,@Param("TipoDoc") String TipoDoc);
    
    // Actualizar un usuario y su tipo
    @Modifying
    @Transactional
    @Query(value = "UPDATE usuario SET Nombre=:nombre, Correo=:correo WHERE Di=:id AND TipoDoc=:tipoDoc", nativeQuery = true)
    void updateUsuario(@Param("id") Integer Di,@Param("tipoDoc") String TipoDoc,@Param("nombre") String Nombre,@Param("correo") String Correo);
    
    // Eliminar un tipo de usuario y un usuario por su ID
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM usuario WHERE Di=:Di AND TipoDoc=:TipoDoc",nativeQuery = true)
    void delete(@Param("Di") Integer Di, @Param("TipoDoc") String TipoDoc);

    // Crea un nuevo usuario
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO usuario (Di, TipoDoc, Nombre, Correo) VALUES(:id, :tipoDoc, :nombre, :correo)",nativeQuery = true)
    void createUsuario(@Param("id") Integer Di,@Param("tipoDoc") String TipoDoc,@Param("nombre") String Nombre,@Param("correo") String Correo);
    
    // Consultar todos los usuarios
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM Usuario", nativeQuery = true)
    List<Usuario> findAll();
}
