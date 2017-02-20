package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        Map<String, Contacto> listado = new HashMap<>();


        int opcion = 0;
        do {



            System.out.println("Gestión de contactos");
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("---------------------");
            System.out.println("Búsqueda: ");
            System.out.println("3. Buscar un contacto por número de teléfono");
            System.out.println("4. Buscar un contacto por nombre");
            System.out.println("--------------------");
            System.out.println("Listados");
            System.out.println("5. Listado de todos los contactos, tal como se han añadido");
            System.out.println("6. Listado de todos los contactos, ordenados por número de teléfono");
            System.out.println("7. Salir");

            System.out.println("Opción");
            opcion = Integer.parseInt(br.readLine());

            switch(opcion){

                case 1: {
                    // Nuevo contacto

                    Contacto contacto = new Contacto();

                    System.out.print("Telefono: ");
                    String telefono = br.readLine();

                    System.out.print("Nombre:");
                    String nombre = br.readLine();

                    System.out.print("Apellidos:");
                    String apellidos = br.readLine();

                    System.out.print("Email: ");
                    String email = br.readLine();

                    listado.put(telefono, new Contacto(nombre, apellidos, email));

                }

                    break;

                case 2: {


                    System.out.println("Escribe un teléfono: ");
                    String telefono = br.readLine();

                    listado.remove(telefono);
                }





                    break;

                case 3:

                    listado.put("654635353",new Contacto("Sheila", "Peña", "murgia85@gmail.com"));

                    listado.get("646464")

                    break;

            }

        }while ( opcion != 7);


    }
}
