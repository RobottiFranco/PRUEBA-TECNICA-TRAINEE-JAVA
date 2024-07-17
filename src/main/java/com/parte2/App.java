package com.parte2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Ticketsys t = new Ticketsys();
        List<Ticketsys> baseDeDatos = new ArrayList<Ticketsys>();
        Ticketsys t1 = new Ticketsys(1, 1, new Date(), new Date(), 100);
        Ticketsys t2 = new Ticketsys(2, 1, new Date(), new Date(), 100);
        Ticketsys t3 = new Ticketsys();

        t3.setAsiento(3);
        t3.setFila(5);
        t3.setFechaCompra(new Date());
        t3.setFechaValidez(new Date());
        t3.setPrecio(100);

        baseDeDatos.add(t1);
        baseDeDatos.add(t2);
        baseDeDatos.add(t3);

        t.calcularTotal(baseDeDatos);

        Scanner esc = new Scanner(System.in);
        System.out.println("Ingrese la fila");
        int numFila = esc.nextInt();
        t.tickerPorFila(baseDeDatos, numFila);
        esc.close();
    }
}
