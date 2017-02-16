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

    public void visualizarMatricula(){

        int total = 0;
        System.out.println("datos matrícula: "+nombre);
        for (Asignatura a: asignaturas){
            System.out.println("nombre"+a.getNombre());
            System.out.println("horas semanales"+a.getHorasSemanales());
            total =+ a.getHorasSemanales();
        }
        System.out.println("total: "+total);
    }




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
