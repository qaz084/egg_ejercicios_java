/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio6 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe un número entero: ");
        int num1 = leer.nextInt();

        System.out.println("Escribe otro número entero: ");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos números son mayores a 25 ");
        }
        else if(num1 > 25 && num2 <= 25)
        {
            System.out.println("Sólo número1 es mayor a 25");
        }else if(num2 > 25 && num1 <= 25){
            
            System.out.println("Sólo num2 es mayor a 25");
        }else{
            System.out.println("Ningún número es mayor a 25");
        }

    }
}
