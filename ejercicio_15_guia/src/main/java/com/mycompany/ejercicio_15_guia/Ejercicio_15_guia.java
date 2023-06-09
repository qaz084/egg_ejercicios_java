/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

package com.mycompany.ejercicio_15_guia;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio_15_guia {

    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         
         int numeros[]=new int[100];
         for (int i = 0; i <numeros.length ; i++) {
             numeros[i]=i;
        }
       for(int i=100 ; i>0 ; i--){
           System.out.println(numeros[i-1]);
       }
        
    }
}
