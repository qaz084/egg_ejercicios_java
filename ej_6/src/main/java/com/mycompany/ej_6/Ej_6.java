/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Crear un programa que dado un numero determine si es par o impar.*/

package com.mycompany.ej_6;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        System.out.println("Ingrese un número: ");
        numeroIngresado=leer.nextInt();
        esParoInpar(numeroIngresado);
    }
    public static void esParoInpar(int num){
        if (num%2==0) {
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }
    }
    
}
