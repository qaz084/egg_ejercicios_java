/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej_16_guia;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_16_guia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cantElementos;
        int numeroBuscado= 0;
        int contador=0;
        boolean flag;
        flag=false;
        
        System.out.println("Introduce el tamaño del vector: ");
        cantElementos=leer.nextInt();
        int vector[]=new int[cantElementos];
        
        for(int i=0;i<vector.length;i++){
            vector[i]= (int)(Math.random()*(10));
        }
        //escribir vector
        System.out.println("El vector es: ");
        for(int elementos:vector){
            System.out.print(elementos+ " ");
        }
        System.out.println("\n De qué número quieres saber la posición: ");
        numeroBuscado= leer.nextInt();
        
      for(int i=0;i<vector.length;i++){
          
          if(vector[i]==numeroBuscado){
              contador++;
              System.out.println("El número "+ numeroBuscado + " está en la posición: "+ (i+1));
          } 
         
      }
      if(contador==0){
          System.out.println("El número no está en el array");
      }
      if(contador>1){
          System.out.println("El número aparece "+contador+" veces");
      }
    }
}
