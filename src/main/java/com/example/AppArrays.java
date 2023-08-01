package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int vector3[] = new int[5];
        for (int i = 0; i < vector3.length; i++) {
            vector3 [i] = 100 * (i+1); 
        }
        System.out.println(Arrays.toString(vector3));
        System.out.println();
        
        double matriz [] [] = new double[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = (i * matriz [i].length + j+1) *10; 
            }
            
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5.1f ", matriz[i][j]);; 
            }

            System.out.println();

        //System.out.println(Arrays.toString(matriz[0]));
        //System.out.println(Arrays.toString(matriz[1]));

        }
        
    }
}
