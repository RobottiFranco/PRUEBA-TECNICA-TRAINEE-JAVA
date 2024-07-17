package com.parte1;

public class Tablero {
    public String[][] iniciarTablero(int x, int y) {
        String[][] mapa = new String[x][y];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = "L";
            }
        }
        return mapa;
    }

    public void elegir(String[][] mapa, int x, int y) {
        try {
            if (mapa[x][y] == "X") {
                throw new Exception("Ocupado");
            }
            mapa[x][y] = "X";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void imprimir(String[][] mapa) {
        int numeroY = 1;
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(numeroY + " ");
            numeroY++;
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
