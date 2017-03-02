package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

                    // Eliminar contacto


                    System.out.print("Escribe un teléfono: ");
                    String telefono = br.readLine();

                    listado.remove(telefono);


                }



                    break;




                case 3: {

                    System.out.println("Escribe un teléfono: ");
                    String telefono = br.readLine();

                    // Buscar contacto por número de teléfono







                }
                    break;

                case 4:{


                    // Buscar contacto por nombre


                }
                    break;
                case 5:

                    //Listado de todos los contactos, tal como se han añadido.

                    listado.forEach((k,v) -> System.out.println("Teléfono: " + k + " " + v));



                    break;

                case 6:

                    // Listado de todos los contactos, ordenados por número de teléfono.

                    SortedSet<String> ordenados = new TreeSet<>();
                    ordenados.addAll(listado.keySet());

                    Iterator<String> it = ordenados.iterator();
                    while(it.hasNext()){
                        String list = it.next();
                        System.out.println("Teléfono: " + list + " -> Contacto: " + listado.get(list));
                    }

                    break;



            }

        }while ( opcion != 7);


    }
}
