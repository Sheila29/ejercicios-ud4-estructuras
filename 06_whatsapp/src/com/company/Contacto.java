package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 7FPROG10 on 16/02/2017.
 */
public class Contacto {

    private String nombre;
    private String apellidos;
    private String email;

    private Map<String, Contacto> listado = new HashMap<>();



    public Contacto() {


    }


    public Contacto(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
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

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
