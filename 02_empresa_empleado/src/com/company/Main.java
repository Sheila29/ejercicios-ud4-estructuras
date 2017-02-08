package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new LinkedList<>();
        int opcion;

        do{

            System.out.println(
                    "    1.Crear nueva empresa.\n" +
                    "    2.Añadir empleado a empresa ya existente.\n" +
                    "    3.Listado de empresas.\n" +
                    "    4.Listado detallado de empresas y empleados.\n" +
                    "    5.Salir\n");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch(opcion){

                case 1:
                    // Crear una nueva empresa


                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Año de fundación: ");
                    String anyofundacion = br.readLine();

                    Empresa e = new Empresa(nombre, anyofundacion);

                    empresas.add(e);

                    break;

                case 2:

                    // Visualizar la empresas para que usuario elija
                    if (empresas.size() > 1) {
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println(empresas);

                        }
                    }




                    Empleado empleado = new Empleado();

                    System.out.println("Nombre: ");
                    empleado.setNombre(br.readLine());

                    System.out.println("Apellidos: ");
                    empleado.setApellidos(br.readLine());

                    System.out.println("Fecha nacimiento: ");
                    empleado.setFechaNacimiento(br.readLine());

                    System.out.println("Contacto: ");
                    empleado.setContacto(br.readLine());

                    e.añadirEmpleado(empleado);


                    break;

                case 3:

                    if (empresas.size() > 0) {
                        //Listado de empresas.
                        for (Empresa empresa : empresas) {
                            System.out.println(empresa);
                        }
                    }

                    break;

                case 4:

                    //Listado detallado de empresas y empleados

                    if (empresas.size() > 0) {
                        //Listado de empresas.
                        for (Empresa empresa : empresas) {
                            System.out.println(empresa);
                        }
                    }

                    if(e.getEmpleados().size()> 0){
                        // Listado empleados
                        for (Empleado emple: e.getEmpleados()){
                            System.out.println(emple);
                        }

                    }




                    break;

                case 5:

                    break;
            }



        }while( opcion != 5);
    }
}
