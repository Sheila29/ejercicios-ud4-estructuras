package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Persona> personas1 = new HashSet<>();

        Set<Persona> personas2 = new HashSet<>();


        Persona persona = new Persona();

        int opcion;

        do {
            System.out.println("1. Conjunto1");
            System.out.println("2. Conjunto2");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());


            switch(opcion) {
                case 1:
                    System.out.println("Conjunto número 1");
                    System.out.print("Escribe en número de DNI: ");

                    String DNI = br.readLine();
                    persona.setDNI(DNI);

                    System.out.print("El nombre del DNI: ");


                    String nombre = br.readLine();
                    persona.setNombre(nombre);

                    personas1.add(persona);



                    break;

                case 2:

                    System.out.println("Conjunto número 2");
                    System.out.print("Escribe en número de DNI: ");

                    DNI = br.readLine();
                    persona.setDNI(DNI);

                    System.out.println("El nombre del DNI: ");
                    nombre = br.readLine();
                    persona.setNombre(nombre);

                    personas2.add(persona);

                break;

                case 3:
                    //Un conjunto formado por todas las personas de los dos grupos, sin duplicados.

                    personas1.retainAll(personas2);

                    for (Persona p : personas1) {
                        System.out.println(p);
                    }

                    break;

                case 4:

                    //Un conjunto formado por todas las personas de los dos grupos, con duplicados.

                    personas1.addAll(personas2);

                    for (Persona p : personas1){
                        System.out.println(p);
                    }

                    break;

                case 5:

                    //Un conjunto formado por las personas del primer grupo que no estén también en el segundo.

                    personas1.remove(personas2);

                    for (Persona p : personas1){
                        System.out.println(p);
                    }

                    break;

                case 6:

                    personas1.addAll(personas2);

                    for (Persona p : personas1){
                        System.out.println(p);
                    }

                    break;

                case 7:
                    System.out.println("Saliendo");
                    break;


            }

        }while ( opcion != 7);






    }
}
