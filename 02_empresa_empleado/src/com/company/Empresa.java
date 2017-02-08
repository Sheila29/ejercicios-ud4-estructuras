package com.company;

import com.company.Empleado;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sheila on 07/02/2017.
 */
public class Empresa {

        private String nombre;
        private String anyoFundacion;

        private List<Empleado> empleados = new LinkedList<>();

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public void añadirEmpleado(Empleado empleado){
            empleados.add(empleado);
            empleado.setEmpresa(this);
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

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return  "Nombre: "+ nombre + '\'' +
                "Año fundación:" + anyoFundacion;
    }
}
