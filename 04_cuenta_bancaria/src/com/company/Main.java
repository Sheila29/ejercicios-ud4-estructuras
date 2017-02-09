package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Titular> titulares = new LinkedList<Titular>();
        List<CuentaBancaria> cuentas = new LinkedList<CuentaBancaria>();




        String opcion = null;

        do {
            System.out.println("a)Titular");
            System.out.println("aa)Nuevo titular");
            System.out.println("b)Cuenta bancaria");
            System.out.println("bb) Nueva cuenta");
            System.out.println("c) Nuevo apunte");
            System.out.println("cc) Borrar cuenta");
            System.out.println("d) Consultas");
            System.out.println("dd) Dado un titular , saldo de todas las cuentas");
            System.out.println("ddd)Dada una cuenta , titulares asociados");
            System.out.println("e) Salir");

            System.out.print("Elije: ");
            opcion = br.readLine();

            switch (opcion){

                case "aa":

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

                case "bb":

                    CuentaBancaria cb = new CuentaBancaria();

                    System.out.println("TITULAR");
                    System.out.println("..............");

                    System.out.println("Código cuenta: ");
                    cb.setCodigoCuenta(br.readLine());


                    cuentas.add(cb);




                break;

                case "c":

                    CuentaBancaria cb2 = new CuentaBancaria();

                    System.out.println(cb2.calcularSaldo());

                    System.out.println("¿qué cantidad quieres ingresar?");
                    int cantidad = Integer.parseInt(br.readLine());
                    cb2.nuevoApunte(cantidad);









                    break;
            }






        }while(opcion.equalsIgnoreCase("4"));

    }
}
