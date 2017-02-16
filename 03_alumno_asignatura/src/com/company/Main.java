package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Alumno> alumnos = new LinkedList<>();
        List<Asignatura> asignaturas = new LinkedList<>();

        int opcion;
        System.out.println("\n" +
                "    1.Crear nuevo alumno.\n" +
                "    2.Crear nueva asignatura.\n" +
                "    3.Matricular alumno en asignatura.\n" +
                "    4.Listado de alumnos matriculados en una asignatura.\n" +
                "    5.Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                "    6.Salir\n");

        System.out.print("Opción: ");
        opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                // Crear un nuevo alumno

                Alumno alumno = new Alumno();

                System.out.print("Nombre: ");
                alumno.setNombre(br.readLine());
                System.out.print("Apellidos: ");
                alumno.setApellidos(br.readLine());
                System.out.print("Email: ");
                alumno.setNombre(br.readLine());

                alumnos.add(alumno);


                break;

            case 2:

                Asignatura asignatura = new Asignatura();

                System.out.println("Nombre: ");
                asignatura.setNombre(br.readLine());
                System.out.println("Horas semanales: ");
                asignatura.setHorasSemanales(Integer.parseInt(br.readLine()));


                asignaturas.add(asignatura);


                break;

            case 3:

                // Matricular alumno en asignatura

                // Mostrar todos los alumnos
                for (int i = 0; i < alumnos.size(); i++) {
                    System.out.println((i + 1) + ". " + alumnos.get(i));
                }

                // Elegir uno
                System.out.print("Nº de alumno: ");
                int numAlumno = Integer.parseInt(br.readLine()) - 1;



                // Mostrar todas las asignaturas
                for (int i = 0; i < asignaturas.size(); i++) {
                    System.out.println((i + 1) + ". " + asignaturas.get(i));
                }

                // Elegir una
                System.out.print("Nº de asignatura: ");
                int numAsignatura = Integer.parseInt(br.readLine()) - 1;


                alumno = alumnos.get(numAlumno); // alumnos en la posición numAlumno
                asignatura = asignaturas.get(numAsignatura);

                alumno.getAsignaturas().add(asignatura);
                asignatura.getAlumnos().add(alumno);


                break;

            case 4:

                // Mostrar todas las asignaturas
                for (int i = 0; i < asignaturas.size(); i++) {
                    System.out.println((i + 1) + ". " + asignaturas.get(i));
                }

                System.out.print("Nº de asignatura: ");
                numAsignatura = Integer.parseInt(br.readLine()) - 1;


                asignatura = asignaturas.get(numAsignatura);

                // Listado de alumnos matriculados en la asignatura
                for (Alumno al : asignatura.getAlumnos()) {
                    System.out.println(al);
                }

                break;


            case 5:

                // Mostrar todos los alumnos
                for (int i = 0; i < alumnos.size(); i++) {
                    System.out.println((i + 1) + ". " + alumnos.get(i));
                }

                System.out.print("Nº de alumno: ");
                numAlumno = Integer.parseInt(br.readLine()) - 1;


                alumno = alumnos.get(numAlumno);

                // Listado de asignaturas que está matriculado el alumno con iterador
                Iterator<Asignatura> it = alumno.getAsignaturas().iterator();
                while (it.hasNext()) {
                    Asignatura as = it.next();
                    System.out.println(as);
                }

                // total de horas
                alumno.visualizarMatricula();

                break;

            case 6:
                System.out.println("Hasta otra...");
                break;

        }
        while (opcion != 6) ;

    }




    }

