package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sheila on 08/02/2017.
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;

    private List<Asignatura> asignaturas = new LinkedList<>();




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
