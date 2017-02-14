package com.company;

import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

import java.util.Calendar;

/**
 * Created by 7FPROG10 on 09/02/2017.
 */
public class Apunte {

    private double cantidad;
    private Calendar fecha;

    private CuentaBancaria cuentaBancaria;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
