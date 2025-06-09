package com.javeriana.ausencias.services;

import com.javeriana.ausencias.models.EstadoAusencia;
import com.javeriana.ausencias.models.MotivoAusencia;
import com.javeriana.ausencias.repository.MotivoAusenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotivoAusenciaService {
    @Autowired
    private MotivoAusenciaRepository motivoAusenciaRepository;
    public List<MotivoAusencia> ListarMotivoAusencias(){
        return motivoAusenciaRepository.findAll();
    }
    public MotivoAusencia obtenerMotivoAusenciaPorId(String id){
        Optional<MotivoAusencia> motivoAusenciaOptional = motivoAusenciaRepository.findById(id);
        return motivoAusenciaOptional.orElse(null);
    }

    public MotivoAusencia agregarMotivoAusencia(MotivoAusencia motivoAusencia){
        return motivoAusenciaRepository.save(motivoAusencia);
    }

    public boolean eliminarMotivoAusencia(String id){
        if(motivoAusenciaRepository.existsById(id)){
            motivoAusenciaRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
