package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sheila on 08/02/2017.
 */
public class Asignatura {

    private String nombre;
    private int horasSemanales;

    private List<Alumno> alumnos = new LinkedList<>();

    public void añadirAlumno(Alumno al){
        getAlumnos().add(al);


    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
