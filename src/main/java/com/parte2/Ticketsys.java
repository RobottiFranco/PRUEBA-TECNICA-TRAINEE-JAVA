package com.parte2;

import java.util.Date;
import java.util.List;

public class Ticketsys {

    private int asiento;
    private int fila;
    private Date fechaCompra;
    private Date fechaValidez;
    private double precio;

    public Ticketsys(int asiento, int fila, Date fechaCompra, Date fechaValidez, double precio) {
        this.asiento = asiento;
        this.fila = fila;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
    }

    public Ticketsys() {
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularTotal(List<Ticketsys> baseDeDatos) {
        double total = 0;
        for (Ticketsys ticketsys : baseDeDatos) {
            total += ticketsys.getPrecio();
        }
        System.out.println("Total: " + total);
    }

    public void tickerPorFila(List<Ticketsys> baseDeDatos, int numFila) {
        for (Ticketsys ticketsys : baseDeDatos) {
            if (ticketsys.getFila() == numFila) {
                System.out.println("Asiento: " + ticketsys.getAsiento() + " Precio: " + ticketsys.getPrecio()
                        + " Fecha de compra: " + ticketsys.getFechaCompra() + " Fecha de validez: "
                        + ticketsys.getFechaValidez() + " Fila: " + ticketsys.getFila());
            }
        }
    }

}
