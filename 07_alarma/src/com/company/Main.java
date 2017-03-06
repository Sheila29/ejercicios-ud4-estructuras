package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        List<SensorMovimiento> sensores = new LinkedList<>();


        do {
        System.out.println("1. Activar alarma");
        System.out.println("2. Desactivar alarma(necesario PIN)");
        System.out.println("3. Consultar sensores");
        System.out.println("4. Salir");

        System.out.println("Opción: ");
        opcion = Integer.parseInt(br.readLine());

        switch(opcion){
            case 1: {

                // Activar alarma

                Alarma a = new Alarma();

                System.out.println("Indica tu número de teléfono: ");
                a.setTelefonoAviso(Integer.parseInt(br.readLine()));

                a.activar();

            }

                break;

            case 2: {

                // Desactivar Alarma

                Alarma a = new Alarma();

                int intentos = 0;

                for (int i = 0; i < intentos; i++) {
                    System.out.println("Introduce el Pin");
                    int pin = Integer.parseInt(br.readLine());
                    intentos++;
                    if (pin == a.getPin()) {
                        a.desactivar(pin);
                        System.out.println("Alarma desactivada");
                    } else {
                        System.err.println("PIN erróneo");
                    }


                }


            }
                break;

            case 3:

                // Consultar sensores

                SensorMovimiento s = new SensorMovimiento();

                System.out.println("Umbral");
                s.setUmbral(Integer.parseInt(br.readLine()));


                if(s.hayMovimiento()){

                    for (SensorMovimiento sm: sensores){
                        sensores.add(s);

                    }



                }













                break;
        }

        }while(opcion != 4);

    }
}
