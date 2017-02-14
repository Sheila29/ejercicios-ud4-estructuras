package com.company;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by 7FPROG10 on 09/02/2017.
 */
public class CuentaBancaria {

    private String codigoCuenta;

    List<Apunte> apuntes = new LinkedList<Apunte>();
    List<Titular> titulares = new LinkedList<Titular>();

    public double calcularSaldo(){

        Apunte a = new Apunte();

        if (a.getCantidad() > 0.0) {

            double suma = 0;
            for (Apunte apunte : apuntes) {
                suma += a.getCantidad();


            }
        }
        return 0.0;


    }

    public void nuevoApunte(double cantidad) {

        Apunte apunte = new Apunte();

        apunte.setCantidad(cantidad);


        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf;

        Calendar cal = Calendar.getInstance();
        System.out.print("Apunte almacenado a las: "+sdf.format(cal.getTime()));
        
        apunte.setFecha(cal);

        apuntes.add(apunte);
        apunte.setCuentaBancaria(this);




    }


    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }
}
