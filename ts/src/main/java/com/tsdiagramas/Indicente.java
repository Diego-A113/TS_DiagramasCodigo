package com.tsdiagramas;

import java.sql.Date;
import java.util.ArrayList;

public class Indicente {

    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList<PersonalAcademico> log_actualizaciones= new ArrayList<>();
    protected ArrayList<Usuario> usuarios=new ArrayList<>();
    protected Date fecha_cerrado;
    protected String tipo;



    //Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha_reportado() {
        return fecha_reportado;
    }
    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }
    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
