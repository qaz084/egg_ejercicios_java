/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_guia_11;
import java.util.Scanner;
/**
 *
 * @author jbi
 */
public class Ejercicio_guia_11 {

    public static void main(String[] args) {
         System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        while (num1<0 || num2<0){
            System.out.println("Escribi numeros positivos");
               num1 = leer.nextDouble();
               num2 = leer.nextDouble();
        }
        System.out.println("Elegir opción\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir\n ");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("la suma de ambos numeros es: "+ (num1+num2));
             break;
            case 2: 
                System.out.println("la resta de ambos numeros es: "+ (num1-num2));
             break;
            case 3: 
                System.out.println("la multiplicacion de ambos numeros es: "+ (num1*num2));
             break;
            case 4: 
                System.out.println("la division de ambos numeros es: "+Math.round(num1/num2));
             break;
            case 5: 
                System.out.println("CHAU.");
             break;
             
        }
    }
    }

