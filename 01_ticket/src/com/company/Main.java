package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Ticket t = new Ticket();

        char respuesta = ' ';
        do {
            System.out.println("Producto: ");
            String producto = br.readLine();

            System.out.println("Precio: ");
            double precio = Double.parseDouble(br.readLine());

            System.out.println("Unidades: ");
            int unidades = Integer.parseInt(br.readLine());

            LineaTicket lt = new LineaTicket(producto, precio, unidades);

            t.anyadirLinea(lt);

            System.out.println("¿quieres continuar?(s/n):");
            respuesta = br.readLine().charAt(0);

        }while(respuesta == 's');

        t.imprimir();


    }
}
