/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package com.mycompany.ej_4;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_4 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         double gradosC,gradosF;
         System.out.println("Ingresa los grados centigrados Cº: ");
         gradosC=leer.nextDouble();
         gradosF=32+(9*gradosC/5);
         
         System.out.println("El equivalente a grados Fahrenheit es: "+gradosF +" Fº" );
         
    }
}
