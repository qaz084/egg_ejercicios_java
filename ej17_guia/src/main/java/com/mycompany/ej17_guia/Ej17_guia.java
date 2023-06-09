/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej17_guia;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej17_guia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          int n;
          int contador=0;
          int digitos=0;
          int digito1, digito2,digito3,digito4,digito5;
          digito1=0;
          digito2=0;
          digito3=0;
          digito4=0;
          digito5=0;
        System.out.println("Ingrese cantidad de números: ");
        n=leer.nextInt();
        int vector[]= new int[n];
        
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*50000);
            int num= vector[i];
            
          for(i=num;i>0;i/=10){
              contador++;
              
          }
          switch (contador) {
                  case 1:
                      digito1++;
                      break;
                  case 2:
                      digito2++;
                      break;
                  case 3:
                      digito3++;
                      break;
                  case 4:
                      digito4++;
                      break;
                  case 5:
                      digito5++;
                      break;
                  default:
                      throw new AssertionError();
              }
//            digitos= Math.round(vector[i]/10)>10; 
//            switch ( num) {
//                case (num>0 || num<9):
//                    
//                    break;
//                default:
//                    throw new AssertionError();
//            }
        }
        for(int elementos:vector){
            System.out.print(elementos+" ");
            
        }
        System.out.println("1 digito: "+digito1);
        
    }
}
