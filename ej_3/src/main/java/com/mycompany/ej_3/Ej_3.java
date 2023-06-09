/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/
package com.mycompany.ej_3;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase,fraseMayuscula, fraseMinuscula;
        System.out.println("Ingresa una frase: ");
        frase=leer.nextLine();
        fraseMayuscula= frase.toUpperCase();
        fraseMinuscula= frase.toLowerCase();
        System.out.println("Tu frase en mayúsculas es:"+ fraseMayuscula);
        System.out.println("Tu frase en minúsculas es:"+ fraseMinuscula);
        
    }
}

