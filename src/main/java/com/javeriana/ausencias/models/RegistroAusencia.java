package com.javeriana.ausencias.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegistroAusencia {
    @Id
    private String idRegistroAusencia;
    private String documento;
    private String nombre;
    private String fechaRegistro;
    private String fechaInicial;
    private String fechaFinal;
    private String emplId;
    private String dependencia;
    private String programa;
    private String correo;
    private String tipo;
    private String cargo;
    private String observacion;
    private String observacionAutor;
    private String reemplazo;
    private String autoriza;
    private String idMotivo;
    private String idEstado;

    public RegistroAusencia() {
    }

    public RegistroAusencia(String idRegistroAusencia, String documento, String nombre, String fechaRegistro, String fechaInicial, String fechaFinal, String emplId, String dependencia, String programa, String correo, String tipo, String cargo, String observacion, String observacionAutor, String reemplazo, String autoriza, String idMotivo, String idEstado) {
        this.idRegistroAusencia = idRegistroAusencia;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.emplId = emplId;
        this.dependencia = dependencia;
        this.programa = programa;
        this.correo = correo;
        this.tipo = tipo;
        this.cargo = cargo;
        this.observacion = observacion;
        this.observacionAutor = observacionAutor;
        this.reemplazo = reemplazo;
        this.autoriza = autoriza;
        this.idMotivo = idMotivo;
        this.idEstado = idEstado;
    }

    public String getIdRegistroAusencia() {
        return idRegistroAusencia;
    }

    public void setIdRegistroAusencia(String idRegistroAusencia) {
        this.idRegistroAusencia = idRegistroAusencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacionAutor() {
        return observacionAutor;
    }

    public void setObservacionAutor(String observacionAutor) {
        this.observacionAutor = observacionAutor;
    }

    public String getReemplazo() {
        return reemplazo;
    }

    public void setReemplazo(String reemplazo) {
        this.reemplazo = reemplazo;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    public String getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(String idMotivo) {
        this.idMotivo = idMotivo;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }
}
