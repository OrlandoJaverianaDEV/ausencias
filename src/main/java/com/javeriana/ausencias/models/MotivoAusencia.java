package com.javeriana.ausencias.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Motivo_Ausencia")
public class MotivoAusencia {
    @Id
    private String idMotivoAusencia;
    @Column
    private String motivo;
    @JsonIgnore
    //@ManyToOne
    @OneToMany(mappedBy = "motivoAusencia")
    private List<RegistroAusencia> registroAusencia;

    public MotivoAusencia() {
    }

    public MotivoAusencia(String idMotivoAusencia, String motivo, List<RegistroAusencia> registroAusencia) {
        this.idMotivoAusencia = idMotivoAusencia;
        this.motivo = motivo;
        this.registroAusencia = registroAusencia;
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

    public List<RegistroAusencia> getRegistroAusencia() {
        return registroAusencia;
    }

    public void setRegistroAusencia(List<RegistroAusencia> registroAusencia) {
        this.registroAusencia = registroAusencia;
    }
}
