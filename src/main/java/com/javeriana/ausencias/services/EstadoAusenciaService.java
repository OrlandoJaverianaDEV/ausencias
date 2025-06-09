package com.javeriana.ausencias.services;

import com.javeriana.ausencias.models.EstadoAusencia;
import com.javeriana.ausencias.repository.EstadoAusenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoAusenciaService {
    @Autowired
    private EstadoAusenciaRepository estadoAusenciaRepository;

    // Método para listar todos los id desde la base de datos
    public List<EstadoAusencia> ListarEstadosAusencias(){
        return estadoAusenciaRepository.findAll();
    }

    // Método para obtener un libro por su ID desde la base de datos
    public EstadoAusencia obtenerEstadoAusenciaPorId(String id){
        Optional<EstadoAusencia> estadoAusenciaOptional = estadoAusenciaRepository.findById(id);
        return estadoAusenciaOptional.orElse(null);
    }

    // Método para agregar un libro a la base de datos
    public EstadoAusencia agregarEstadoAusencia(EstadoAusencia estadoAusencia){
        return estadoAusenciaRepository.save(estadoAusencia);
    }

    // Método para eliminar un libro por su ID desde la base de datos
    public boolean eliminarEstadoAusencia(String id) {
        if (estadoAusenciaRepository.existsById(id)) {
            estadoAusenciaRepository.deleteById(id);
            return true;
        }
        return false;
    }






}
