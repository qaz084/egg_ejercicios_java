/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_12;
import java.util.Scanner;
/**
 *
 * @author jbi
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        int num1,num2;
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese dos números para saber si son múltiplos");
         num1=leer.nextInt();
         num2=leer.nextInt();
         esMultiplo( num1, num2);
    
    }
    
    public static void esMultiplo(int num1,int num2){
       if(num2 % num1==0){
           System.out.println(num1+ " es múltiplo de "+num2);
       }else{
           System.out.println("Los numeros no son múltiplos");
       }
    }
}
