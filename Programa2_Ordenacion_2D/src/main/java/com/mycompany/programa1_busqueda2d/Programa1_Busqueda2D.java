/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_busqueda2d;

/**
 *
 * @author Pablo Alexander
 */
public class Programa1_Busqueda2D {
    static int[] buscar(int[][] a, int x) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j] == x) return new int[]{i, j};
        return new int[]{-1, -1};
    }
    

    public static void main(String[] args) {
        int[][] matriz ={ 
            {7,5,3},
            {9,4,8},
            {2,6,1},
        };
        int[] pos = buscar(matriz, 9);
        System.out.println("Valor encontrado en Posicion: [" + pos[0] + "][" + pos[1] + "]");
    }
}
