package com.javeriana.ausencias.repository;

import com.javeriana.ausencias.models.EstadoAusencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoAusenciaRepository extends JpaRepository<EstadoAusencia, String> {
}
