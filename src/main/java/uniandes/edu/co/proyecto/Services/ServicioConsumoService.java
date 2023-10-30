package uniandes.edu.co.proyecto.Services;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniandes.edu.co.proyecto.model.ServicioConsumo;
import uniandes.edu.co.proyecto.repositorio.ServicioConsumoRepository;

@Service
public class ServicioConsumoService {

    @Autowired
    private ServicioConsumoRepository servicioConsumoRepository;

    public List<Object[]> findDineroRecolectadoPorHabitacion() {
        LocalDate anioAnterior = LocalDate.now().minusYears(1);
        LocalDate anioActual = LocalDate.now();
        return servicioConsumoRepository.findDineroRecolectadoPorHabitacion(anioAnterior, anioActual);
    }
}
