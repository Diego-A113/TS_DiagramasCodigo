package com.tsdiagramas;

import java.util.ArrayList;

public class Curso {

    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
    private ArrayList<Foro> foros;
    private ArrayList<ActividadSumativa> actividadesSumativas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public Profesor getResponsable() {
        return responsable;
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public ArrayList<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public void setEstudiantesEnEsperaDeInscripcion(ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public ArrayList<Foro> getForos() {
        return foros;
    }

    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

    public ArrayList<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(ArrayList<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

    public Curso(){

    }

}