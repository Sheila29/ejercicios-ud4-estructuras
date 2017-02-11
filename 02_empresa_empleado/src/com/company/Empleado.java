package com.company;

/**
 * Created by Sheila on 07/02/2017.
 */
public class Empleado {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String contacto;
    private Empresa empresa;





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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre: " + nombre + '\'' +
                "Apellidos='" + apellidos + '\'' +
                "FechaNacimiento='" + fechaNacimiento + '\'' +
                "Contacto='" + contacto + '\'' +
                '}';
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
