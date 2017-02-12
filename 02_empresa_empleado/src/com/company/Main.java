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

                    Empresa emp= new Empresa(nombre, anyofundacion);
                    empresas.add(emp);

                    break;

                case 2:

                    // Añadir empleado a empresa ya existente

                    int numerar = 1;
                    for (Empresa e : empresas){
                        System.out.println(numerar+". "+e.getNombre());
                        numerar++;
                    }

                        System.out.println("Elije empresa");
                        int numEmpresa = Integer.parseInt(br.readLine())-1;

                        Empleado empleado = new Empleado();

                        System.out.println("Nombre: ");
                        empleado.setNombre(br.readLine());

                        System.out.println("Apellidos: ");
                        empleado.setApellidos(br.readLine());

                        System.out.println("Fecha nacimiento: ");
                        empleado.setFechaNacimiento(br.readLine());

                        System.out.println("Contacto: ");
                        empleado.setContacto(br.readLine());


                        empresas.get(numEmpresa).añadirEmpleado(empleado);




                    break;

                case 3:

                        //Listado de empresas.
                        for (Empresa empresa : empresas) {
                            System.out.println(empresa);
                        }


                    break;

                case 4:

                    //Listado detallado de empresas y empleados

                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println(i);
                            for (int j = 0; j < empresas.get(i).getEmpleados().size(); j++) {
                                System.out.println(j);
                            }

                        }


                    





                    break;

            }



        }while( opcion != 5);
    }
}
