/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_biarray;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_BiArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        int n;
        int fila = 0;
        int columna = 0;
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        System.out.print("Ingrese el valor de N: ");
        n = scan.nextInt();
        System.out.println("");

        int array[][] = new int[n][n];

        //Creación del arreglo
        while (fila < n) {
            while (columna < n) {

                array[fila][columna] = random.nextInt(10, 99);
                columna++;

            }

            columna = 0;
            fila++;
        }

        //Suma principal
        fila = 0;
        columna = 0;

        while (fila < n) {
            sumaPrincipal += array[fila][columna];
            fila++;
            columna++;
        }

        //Suma secundaria
        fila = 0;
        columna = n-1;

        while (columna >= 0) {
            sumaSecundaria += array[fila][columna];
            fila++;
            columna--;
        }
        
        
        //Impresión del arreglo y sumas
        columna = 0;
        fila = 0;

        while (fila < n) {
            while (columna < n) {

                System.out.print(array[fila][columna] + " | ");
                columna++;

            }

            System.out.println("");
            columna = 0;
            fila++;
        }
        System.out.println("\nSuma Principal: "+sumaPrincipal);
        System.out.println("Suma Secundaria: "+sumaSecundaria);
    }
}
