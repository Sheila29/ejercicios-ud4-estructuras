package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List lista1 = new LinkedList();
        lista1.add("elemento1");
        lista1.add("elemento2");
        lista1.add("elemento3");
        mostrar_elementos(lista1);

        List lista2 = new ArrayList();
        lista2.add("elemento1");
        lista2.add("elemento2");
        lista2.add("elemento3");
        mostrar_elementos(lista2);

        Set conjunto1 = new HashSet();
        conjunto1.add("elemento1");
        conjunto1.add("elemento2");
        conjunto1.add("elemento3");
        mostrar_elementos(conjunto1);

        Set conjunto2 = new TreeSet();
        conjunto2.add("elemento1");
        conjunto2.add("elemento2");
        conjunto2.add("elemento3");
        mostrar_elementos(conjunto2);

        Map mapa1 = new HashMap();
        mapa1.put("clave1", "elemento1");
        mapa1.put("clave2", "elemento2");
        mapa1.put("clave3", "elemento3");
        mostrar_elementos(mapa1.keySet());
        mostrar_elementos(mapa1.values());


        Map mapa2 = new TreeMap();
        mapa2.put("clave1", "elemento1");
        mapa2.put("clave2", "elemento2");
        mapa2.put("clave3", "elemento3");
        mostrar_elementos(mapa2.keySet());
        mostrar_elementos(mapa2.values());
    }


    static void mostrar_elementos(Collection coleccion) {
        Iterator iterador = coleccion.iterator();
        while (iterador.hasNext()) {
            String elemento = (String) iterador.next();
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}


