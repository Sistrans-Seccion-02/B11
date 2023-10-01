package uniandes.edu.co.proyecto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniandes.edu.co.proyecto.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    // Consultar un usuario y su tipo por su ID
    Usuario findById(int id);
    
    // Actualizar un usuario y su tipo
    Usuario save(Usuario usuario);
    
    // Eliminar un tipo de usuario y un usuario por su ID
    void deleteById(int id);
    
    // Consultar todos los tipos de usuarios y los usuarios
    List<Usuario> findAll();

     // Consultar usuarios y tipos de usuario por su rol (ejemplo: "Gerente")
     List<Usuario> findByRol(String rol);
    

}
