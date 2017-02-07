package com.company;

import java.util.LinkedList;
import java.util.List;


public class Ticket {

    private List<LineaTicket> lineas = new LinkedList<>();

    public void anyadirLinea(LineaTicket lt){
        lineas.add(lt);
        lt.setTicket(this);// el ticket al que está conectado a esta línea es este

    }

    public void imprimir(){

        double total = 0.0;
        for (LineaTicket lt: lineas){
            System.out.println(lt+", total: "+lt.getTotal());
            total += lt.getTotal();
        }

        System.out.println("total a pagar: "+total);


    }


}
