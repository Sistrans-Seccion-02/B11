package uniandes.edu.co.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.model.ServicioConsumo;
import uniandes.edu.co.proyecto.Services.ServicioConsumoService;

@RestController
@RequestMapping("/api/servicio-consumo")
public class ServicioConsumoController {

    @Autowired
    private ServicioConsumoService servicioConsumoService;

    @GetMapping("/dinero-recolectado-por-habitacion")
    public List<Object[]> findDineroRecolectadoPorHabitacion() {
        return servicioConsumoService.findDineroRecolectadoPorHabitacion();
    }
}
