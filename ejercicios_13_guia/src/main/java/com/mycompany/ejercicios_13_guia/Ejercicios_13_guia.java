/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicios_13_guia;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicios_13_guia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantElementos=0;
        System.out.println("Ingrese la cantidad de elementos: ");
        cantElementos=leer.nextInt();
        

    }
}

//
//Definir num, i, j Como Entero
// 
// Escribir "Por favor, ingrese un número mayor a cero:"
// Leer num
// 
// Para i <- num Hasta 1 Hacer
//  Para j <- 1 Hasta num Hacer
//   si i == 1 o i == num Entonces
//    Escribir Sin Saltar " * "
//   SiNo
//    si i == 1 o i == num o j == 1 o j == num Entonces
//     Escribir Sin Saltar " * "
//    Sino  
//     Escribir Sin Saltar "   "
//    FinSi
//   FinSi
//  FinPara
//  Escribir "  "
// FinPara
