package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by 7FPROG10 on 06/03/2017.
 */
public class Alarma {

    private int pin;
    private boolean activada;
    private int telefonoAviso;

    private List<SensorMovimiento> sensores = new LinkedList<>();


    public Alarma() {

        Random r = new Random();

        int numeroSensor = r.nextInt(5);

        for (int i = 0; i < numeroSensor; i++) {
            SensorMovimiento sensor = new SensorMovimiento();
        }
    }

    public void consultarSensores(){

        // sensores activos








        // dispara alarma

        activada = true;


        // aviso número teléfono



        // ¿qué sensor ha disparado la alarma?














    }

    public void activar(){



        Random r = new Random();

        setPin(r.nextInt(9999));

        System.out.println(getPin());






    }

    public void desactivar(int pin){









    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }
}
