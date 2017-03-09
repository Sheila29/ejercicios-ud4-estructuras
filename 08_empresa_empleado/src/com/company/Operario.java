package com.company;

/**
 * Created by 7FPROG10 on 06/03/2017.
 */
public class Operario extends Empleado{

    private double salarioHora;
    private int horasContrato;

    public Operario(double salarioHora, int horasContrato) {
        this.salarioHora = salarioHora;
        this.horasContrato = horasContrato;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }
}
