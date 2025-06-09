package com.javeriana.ausencias.services;

import com.javeriana.ausencias.models.RegistroAusencia;
import com.javeriana.ausencias.repository.RegistroAusenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAusenciaService {
    @Autowired
    private RegistroAusenciaRepository registroAusenciaRepository;
    public List<RegistroAusencia> ListarRegistroAusencias(){return registroAusenciaRepository.findAll();}
    public RegistroAusencia obtenerRegistroAusenciaPorId(String id){
        Optional<RegistroAusencia> registroAusenciaOptional = registroAusenciaRepository.findById(id);
        return registroAusenciaOptional.orElse(null);
    }
    public RegistroAusencia agregaRegistroAusencia(RegistroAusencia registroAusencia){
        return registroAusenciaRepository.save(registroAusencia);
    }

    public boolean eliminarRegistroAusencia(String id){
        if(registroAusenciaRepository.existsById(id)){
            registroAusenciaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
