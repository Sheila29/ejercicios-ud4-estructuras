package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Titular> titulares = new LinkedList<Titular>();
        List<CuentaBancaria> cuentas = new LinkedList<CuentaBancaria>();

        int opcion = 0;

        do {
            System.out.println("Titular");
            System.out.println("1)Nuevo titular");
            System.out.println("2)Cuenta bancaria");
            System.out.println("Nueva cuenta");
            System.out.println("3)Nuevo apunte");
            System.out.println("4)Borrar cuenta");
            System.out.println("Consultas");
            System.out.println("5) Dado un titular , saldo de todas las cuentas");
            System.out.println("6) Dada una cuenta , titulares asociados");
            System.out.println("7) Salir");

            System.out.print("Elije: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion){

                case 1:

                    System.out.println("TITULAR");
                    System.out.println("..............");

                    Titular t = new Titular();

                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());

                    System.out.print("Apellidos: ");
                    t.setApellidos(br.readLine());

                    System.out.println("DNI: ");
                    t.setDNI(br.readLine());

                    System.out.println("Fecha alta: ");
                    t.setFechaAlta(br.readLine());

                    titulares.add(t);


                    break;

                case 2:

                    System.out.println("CUENTA BANCARIA");
                    System.out.println("..............");

                    CuentaBancaria cb = new CuentaBancaria();

                    System.out.println("TITULAR");
                    System.out.println("..............");

                    System.out.println("Código cuenta: ");
                    cb.setCodigoCuenta(br.readLine());


                    cuentas.add(cb);




                break;

                case 3:

                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println((i + 1) + ". " +cuentas.get(i));
                    }

                    System.out.print("Elige una cuenta: ");
                    int numCuenta = Integer.parseInt(br.readLine()) - 1;

                    // Generar el objeto
                    Apunte apunte = new Apunte();

                    System.out.print("Cantidad: ");
                    double cantidad = Double.parseDouble(br.readLine());

                    cuentas.get(numCuenta).nuevoApunte(cantidad);




                    break;

                case 4:

                    // Borrar cuenta


                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println((i + 1) + ", " + cuentas.get(i));
                    }

                        System.out.println("Elije la cuenta que quieres borrar: ");
                        int borrarnumCuenta = Integer.parseInt(br.readLine()) - 1;

                        cuentas.remove(borrarnumCuenta);




                    break;

                case 5:

                    //Dado un titular , saldo de todas las cuentas


                    for (int i = 0; i < titulares.size() ; i++) {
                        System.out.println((i+1)+". "+titulares.get(i));
                    }

                    System.out.println("Elije un titular: ");
                    int numtitular = Integer.parseInt(br.readLine());





                case 7:

                    System.out.println("Has elegido salir....");




                    break;

            }






        }while(opcion != 7);

    }
}
