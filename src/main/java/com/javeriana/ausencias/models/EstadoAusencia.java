package com.javeriana.ausencias.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Estado_Ausencia")
public class EstadoAusencia {
    @Id
    private String idEstado;
    @Column
    private String estado;
    @JsonIgnore
    //@ManyToOne
    @OneToMany(mappedBy = "estadoAusencia")
    private List<RegistroAusencia> registroAusencia;

    public EstadoAusencia() {
    }

    public EstadoAusencia(String idEstado, String estado, List<RegistroAusencia> registroAusencia) {
        this.idEstado = idEstado;
        this.estado = estado;
        this.registroAusencia = registroAusencia;
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

    public List<RegistroAusencia> getRegistroAusencia() {
        return registroAusencia;
    }

    public void setRegistroAusencia(List<RegistroAusencia> registroAusencia) {
        this.registroAusencia = registroAusencia;
    }
}
