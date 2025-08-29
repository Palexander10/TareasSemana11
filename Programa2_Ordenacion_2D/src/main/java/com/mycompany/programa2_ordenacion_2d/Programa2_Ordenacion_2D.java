/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2_ordenacion_2d;
import java.util.Arrays;

/**
 *
 * @author Pablo Alexander
 */
public class Programa2_Ordenacion_2D {
       public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ordena en ascendente la fila indicada (0..2)
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila < 0 || fila >= matriz.length) {
            throw new IllegalArgumentException("Índice de fila fuera de rango: " + fila);
        }
        Arrays.sort(matriz[fila]);
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {26, 5, 10},
            {7, 15, 11},
            {12, 8, 22}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int fila =0;
        if (args.length > 0) {
            try {
                fila = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argumento inválido, usando fila 1 por defecto.");
            }
        }

        ordenarFila(matriz, fila);
        System.out.println("\nMatriz con la fila " + fila + " Ordenada en ascendente:");
        mostrarMatriz(matriz);
    }
}
  