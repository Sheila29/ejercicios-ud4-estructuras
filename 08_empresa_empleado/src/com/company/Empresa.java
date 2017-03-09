package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG10 on 06/03/2017.
 */
public class Empresa {

    private String nombre;
    private String anyoFundacion;

    private List<Empleado> empleados = new ArrayList<>();

    public void listadoEmpleados(){
        System.out.println("De la empresa"+nombre);
        for(Empleado e: getEmpleados()){
            System.out.println("Nombre"+e.getNombre());
            System.out.println("Apellidos"+e.getApellidos());
        }
    }

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
