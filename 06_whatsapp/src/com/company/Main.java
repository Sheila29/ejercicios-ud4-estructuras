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

        List<Contacto> contactos = new ArrayList<>();



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

                case 1:
                    // Nuevo contacto

                    Contacto contacto = new Contacto();

                    System.out.println("Nombre:");
                    contacto.setNombre(br.readLine());

                    System.out.println("Apellidos:");
                    contacto.setApellidos(br.readLine());

                    System.out.println("Email: ");
                    contacto.setEmail(br.readLine());

                    contactos.add(contacto);


                    break;

                case 2:


                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.println((i+1)+". "+contactos.get(i));
                    }

                    System.out.println("Qué contacto quieres eliminar?");
                    int contactoSeleccionado = Integer.parseInt(br.readLine());


                    break;

                case 3:

                    listado.put("654635353",new Contacto("Sheila", "Peña", "murgia85@gmail.com"));

                    listado.get("646464")

                    break;

            }

        }while ( opcion != 7);


    }
}
