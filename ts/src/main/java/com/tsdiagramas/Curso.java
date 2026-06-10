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

    public Curso(){

    }

}