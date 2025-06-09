package com.javeriana.ausencias.repository;

import com.javeriana.ausencias.models.MotivoAusencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivoAusenciaRepository extends JpaRepository<MotivoAusencia, String> {
}
