package com.javeriana.ausencias.repository;

import com.javeriana.ausencias.models.MotivoAusencia;
import com.javeriana.ausencias.models.RegistroAusencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroAusenciaRepository extends JpaRepository<RegistroAusencia, String> {
}
