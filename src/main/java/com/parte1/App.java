package com.parte1;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero p = new Tablero();
        String[][] mapa = p.iniciarTablero(10, 10);
        boolean bucle = true;
        while (bucle) {
            try {
                System.out.println("Ingrese la fila (1 - 10)");
                int x = scanner.nextInt();
                System.out.println("Ingrese la columna (1 - 10)");
                int y = scanner.nextInt();

                p.elegir(mapa, x - 1, y - 1);
                p.imprimir(mapa);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Desea continuar? (s/n)");
            String continuar = scanner.next();
            if (continuar.equals("n".toLowerCase())) {
                bucle = false;
            }
        }

        scanner.close();
    }
}
