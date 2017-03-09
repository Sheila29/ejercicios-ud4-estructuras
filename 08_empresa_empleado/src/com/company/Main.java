package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new ArrayList<>();
        List<Operario> operarios = new ArrayList<>();
        List<Directivo> directivos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Empresa");
            System.out.println("1.Crear nueva empresa");
            System.out.println("2. Borrar una empresa ");
            System.out.println("Añadir empleados(a una empresa)");
            System.out.println("3. Añadir operario");
            System.out.println("4. Añadir directivo");
            System.out.println("5. Lista empleados(de la empresa)");
            System.out.println("Listados");
            System.out.println("6. Todas las empresas");
            System.out.println("7. Todos los empleados");
            System.out.println("8. Listado por empresa y empleado");
            System.out.println("9. Salir");

            System.out.print("Elije una opción");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Crear nueva empresa

                    System.out.print("Nombre");
                    String nombre = br.readLine();

                    System.out.print("Año de fundación");
                    String anyofundacion = br.readLine();

                    empresas.add(new Empresa(nombre, anyofundacion));

                    break;

                case 2:

                    // Borrar una empresa

                    if (empresas.size() > 0) {
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println((i + 1) + ": " + empresas.get(i));

                        }

                        System.out.println("Elije una empresa");
                        int empresaSelec = Integer.parseInt(br.readLine()) - 1;

                        Empresa e = empresas.get(empresaSelec);

                        empresas.remove(e);
                        e = null;

                    } else {
                        System.err.println("Tienes que crear una empresa primero para poder borrarla");
                    }


                    break;

                case 3:

                    // Añadir operario

                    System.out.printf("Salario hora");
                    double salarioHora = Double.parseDouble(br.readLine());

                    System.out.println("Horas contrato");
                    int horasContrato = Integer.parseInt(br.readLine());

                    operarios.add(new Operario(salarioHora, horasContrato));


                    break;

                case 4:

                    // Añadir directivo

                    System.out.printf("Salario anual");
                    double salarioAnual = Double.parseDouble(br.readLine());

                    System.out.println("Bonus personal");
                    double bonusPersonal = Double.parseDouble(br.readLine());

                    directivos.add(new Directivo(salarioAnual, bonusPersonal));


                    break;

                case 5:

                    // Lista empleados(de la empresa)

                    if (empresas.size() > 0) {
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println((i + 1) + ": " + empresas.get(i));

                        }

                        System.out.println("Elije una empresa");
                        int empresaSelec = Integer.parseInt(br.readLine()) - 1;

                        Empresa e = empresas.get(empresaSelec);

                        e.listadoEmpleados();

                    } else {
                        System.err.println("Tienes que crear una empresa para poder mostrarte los empleados");
                    }


                    break;


                case 6:

                    // Todas la empresas

                    for(Empresa emp: empresas){
                        System.out.println("Empresas"+emp.getNombre());
                    }


                    break;

                case 7:

                    // Todos los empleados

                    for(Empresa empresa: empresas){
                        System.out.println("Empleados"+empresa.getEmpleados());

                    }


                    break;


                case 8:

                    // Listado por empresa y empleado

                    Iterator<Empresa> it = empresas.iterator();

                    while(it.hasNext()){
                        Empresa e = it.next();

                        System.out.println("Nombre"+e.getNombre());

                    }



                    break;


            }

        } while (opcion != 9);


    }
}
