package com.javeriana.ausencias.controllers;

import com.javeriana.ausencias.models.EstadoAusencia;
import com.javeriana.ausencias.models.MotivoAusencia;
import com.javeriana.ausencias.services.MotivoAusenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("motivoAusencias")
public class MotivoAusenciaController {
    @Autowired
    private MotivoAusenciaService motivoAusenciaService;
    @GetMapping
    public List<MotivoAusencia> listarMotivoEstado(){return motivoAusenciaService.ListarMotivoAusencias();}
    @GetMapping("/{id}")
    public MotivoAusencia obtenerMotivoPorId(@PathVariable String id){return motivoAusenciaService.obtenerMotivoAusenciaPorId(id);}
    @PostMapping
    public MotivoAusencia agregarMotivoAusencia(@RequestBody MotivoAusencia motivoAusencia) {return motivoAusenciaService.agregarMotivoAusencia(motivoAusencia);}
    @DeleteMapping("/{id}")
    public boolean eliminarMotivo(@PathVariable String id){return motivoAusenciaService.eliminarMotivoAusencia(id);}


}
