package com.javeriana.ausencias.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EstadoAusencia {
    @Id
    private String idEstado;

    private String estado;

    public EstadoAusencia() {
    }

    public EstadoAusencia(String idEstado, String estado) {
        this.idEstado = idEstado;
        this.estado = estado;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
