package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 7FPROG10 on 09/02/2017.
 */
public class Titular {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String fechaAlta;

    private List<CuentaBancaria> cuentas = new LinkedList<>();

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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
