/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;
import  java.util.Scanner;
import java.lang.String.repeat();

/**
 *
 * @author jbi
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        String asterisco = " *";
        
        for(int i=0;i<4;i++){
            
             System.out.println("Ingresa un número entre 1 y 20");
            numeroIngresado= leer.nextInt();
            
            while(numeroIngresado<1||numeroIngresado>20){
                System.out.println("Numero incorrecto, ingrese un número correcto");
                numeroIngresado= leer.nextInt();
            }
//            numeroIngresado= (int) Math.round(Math.random()*20);
         
            for(int j=0;j<numeroIngresado;j++){
                System.out.print(asterisco);
            }
             System.out.println("");
             System.out.println("");
        }
    }
}





//COMENT

//      Scanner leer = new Scanner(System.in);
//        int numeroIngresado;
//      String asterisco = " *";
//        for(int i=0;i<4;i++){
//            // System.out.println("Ingresa un número entre 1 y 20");
//       // numeroIngresado= leer.nextInt();
//            numeroIngresado= (int) Math.round(Math.random()*20);
//         
//            for(int j=0;j<numeroIngresado;j++){
//                System.out.println(asterisco);
//            }
//             System.out.println("");
//             System.out.println("");
//        }




//int num ;
//  double num1;
//  
//  for(int i= 0 ; i <= 3 ; i++) {
//   num= (int) Math.round(Math.random()*10);
//   
//   System.out.println(num + " *".repeat(num));
//  }
//  num1 =(Math.random()*100);
//  int num3 = (int) Math.round(num1);