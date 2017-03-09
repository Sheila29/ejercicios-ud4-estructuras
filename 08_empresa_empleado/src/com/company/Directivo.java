package com.company;

/**
 * Created by 7FPROG10 on 06/03/2017.
 */
public class Directivo extends Empleado{

    private double salarioAnual;
    private double bonusPersonal;

    public Directivo(double salarioAnual, double bonusPersonal) {
        this.salarioAnual = salarioAnual;
        this.bonusPersonal = bonusPersonal;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public double getBonusPersonal() {
        return bonusPersonal;
    }

    public void setBonusPersonal(double bonusPersonal) {
        this.bonusPersonal = bonusPersonal;
    }
}
