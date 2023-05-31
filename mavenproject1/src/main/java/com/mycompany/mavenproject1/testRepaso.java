/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class testRepaso {
    
   public static void main(String[] arg){
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Escribe tu nombre: ");
       String nombre= leer.next();
       
       System.out.println("----------");
       System.out.println("Tu nombre es: ");
       System.out.println(nombre);
   }
    
}
