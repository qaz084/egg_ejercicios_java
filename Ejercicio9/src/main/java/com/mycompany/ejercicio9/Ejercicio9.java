/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //equalsIgnoreCase 
        int numeroIngresado;
        int sumaNumerosIngresados = 0;
        boolean bandera=false;

        for (int i = 0; i < 20; i++) {
            
            System.out.println("Ingrese un número: ");
            numeroIngresado= leer.nextInt();
            
            if(numeroIngresado>0){
                
             sumaNumerosIngresados=sumaNumerosIngresados+numeroIngresado;
             
            }else if(numeroIngresado==0){
                System.out.println("Se capturó el número cero");
             /* i=20;*/
               i=20;
            } else if(i==19){
                bandera=true;
            }
        }
        if(bandera){
             System.out.println("La suma de los números es: "+ sumaNumerosIngresados);
        }
    }
}
