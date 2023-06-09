/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

package com.mycompany.ej_1;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_1 {

    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       int num1,num2,resultadoSuma;
        System.out.println("Ingresa dos números: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        resultadoSuma=num1+num2;
        
        System.out.println("La suma de "+num1+" y "+num2+" es: "+resultadoSuma);
    }
}
