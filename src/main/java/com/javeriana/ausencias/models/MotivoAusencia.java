package com.javeriana.ausencias.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MotivoAusencia {
    @Id
    private String idMotivoAusencia;
    private String motivo;
    @ManyToOne
    @JoinColumn(name = "estado", referencedColumnName = "idEstado")
    private EstadoAusencia estado;

    public MotivoAusencia() {
    }

    public MotivoAusencia(String idMotivoAusencia, String motivo, EstadoAusencia estado) {
        this.idMotivoAusencia = idMotivoAusencia;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getIdMotivoAusencia() {
        return idMotivoAusencia;
    }

    public void setIdMotivoAusencia(String idMotivoAusencia) {
        this.idMotivoAusencia = idMotivoAusencia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoAusencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoAusencia estado) {
        this.estado = estado;
    }
}
