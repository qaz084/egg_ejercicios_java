/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
package com.mycompany.ej_5;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado,doble,triple,raiz;
        
        System.out.println("Ingresa un número entero: ");
        numeroIngresado=leer.nextInt();
        
        doble=numeroIngresado*2;
        triple=numeroIngresado*3;
        raiz= (int) Math.sqrt(numeroIngresado);
        
        System.out.println("El doble del número es: "+doble);
        System.out.println("El triple: "+triple);
        System.out.println("Y la raiz: "+raiz);
        
    }
}
