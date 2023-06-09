/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

package com.mycompany.ej_2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_2 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String nombre;
        System.out.println("por favor, ingresa tu nombre :) : ");
        nombre=leer.next();
        System.out.println("Tu nombre es: "+nombre);
    }
}
