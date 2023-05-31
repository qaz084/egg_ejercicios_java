/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;
  import java.util.Scanner;
/**
 * @author jbi
 */
public class Ejercicio8 {

 public static void main(String[] args) {
 Scanner leer = new Scanner (System.in);
 
int nota;
        
        System.out.println("Decime un número");
        nota = leer.nextInt();
    
     while (nota<0 || nota>10){
     System.out.println("Decime un número");
        nota = leer.nextInt();
     }
     
      System.out.println("Joya, el num está entre 0 y 10");            
}
}

