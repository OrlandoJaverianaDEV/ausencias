package com.javeriana.ausencias.controllers;

import com.javeriana.ausencias.models.MotivoAusencia;
import com.javeriana.ausencias.models.RegistroAusencia;
import com.javeriana.ausencias.services.MotivoAusenciaService;
import com.javeriana.ausencias.services.RegistroAusenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("registroAusencias")
public class RegistroAusenciaController {
    @Autowired
    private RegistroAusenciaService registroAusenciaService;
    @GetMapping
    public List<RegistroAusencia> listarRegistroAusencia(){return registroAusenciaService.ListarRegistroAusencias();}
    @GetMapping("/{id}")
    public RegistroAusencia obtenerRegistroPorId(@PathVariable String id){return registroAusenciaService.obtenerRegistroAusenciaPorId(id);}
    @PostMapping
    public RegistroAusencia agregarRegistroAusencia(@RequestBody RegistroAusencia registroAusencia) {return registroAusenciaService.agregaRegistroAusencia(registroAusencia);}

    @DeleteMapping("/{id}")
    public boolean eliminarRegistro(@PathVariable String id){return registroAusenciaService.eliminarRegistroAusencia(id);}


}
