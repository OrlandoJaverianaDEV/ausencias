package com.javeriana.ausencias.controllers;

import com.javeriana.ausencias.models.EstadoAusencia;
import com.javeriana.ausencias.services.EstadoAusenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadoAusencias")
public class EstadoAusenciaController {
    @Autowired
    private EstadoAusenciaService estadoAusenciaService;
    @GetMapping
    public List<EstadoAusencia> listarEstadosAusencia(){return estadoAusenciaService.ListarEstadosAusencias();}
    @GetMapping("/{id}")
    public EstadoAusencia obtenerEstadoPorId(@PathVariable String id){return estadoAusenciaService.obtenerEstadoAusenciaPorId(id);}

    @PostMapping
    public EstadoAusencia agregarEstadoAusencia(@RequestBody EstadoAusencia estadoAusencia){return estadoAusenciaService.agregarEstadoAusencia(estadoAusencia);}

    @DeleteMapping("/{id}")
    public boolean eliminarEstadoAusencia(@PathVariable String id){return estadoAusenciaService.eliminarEstadoAusencia(id);}
}
