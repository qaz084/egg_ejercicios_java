/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio7 {

    public static void main(String[] args) {
      
       Scanner leer= new Scanner(System.in);
       
       int tipoMotor;
        System.out.println("Ingresa un número según el tipo de motor: (Entre 1 y 4)");
        tipoMotor =leer.nextInt();
        
        while (tipoMotor<=0 ||tipoMotor>4) {            
            System.out.println("Número incorrecto, ingresa uno nuevo");
              tipoMotor =leer.nextInt();
        }
        switch (tipoMotor) {
            case 1:
                    System.out.println("“La bomba es una bomba de\n" +
"agua”.");
                break;
            case 2:
                    System.out.println("“La bomba es una bomba de\n" +
"gasolina”.");
                break;
            case 3:
                    System.out.println("“La bomba es una bomba de\n" +
"hormigon”.");
                break;
            case 4:
                    System.out.println("“La bomba es una bomba de\n" +
"alimenticia”.");
                break;
            default:
                throw new AssertionError("No existe un valor\n" +
"válido para tipo de bomba");
        }
        
    }
}
