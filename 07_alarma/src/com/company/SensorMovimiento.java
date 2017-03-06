package com.company;

import java.util.Random;

/**
 * Created by 7FPROG10 on 06/03/2017.
 */
public class SensorMovimiento {

    private int umbral;

    private Alarma alarma;



    public SensorMovimiento() {

        Random r = new Random();
        int numeroSensor = r.nextInt(100);

        setUmbral(numeroSensor);




    }

    public boolean hayMovimiento(){


        Random r = new Random();
        int numeroMovimiento = r.nextInt(100);

        return (numeroMovimiento > getUmbral());

    }


    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
}
