/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//EJERCICIO 11
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios.
//
//a e i o u
//@ # $ % *
//
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

package com.mycompany.ejercicio_11;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fraseIngresada;
        System.out.println("Ingrese una frase FINALIZADA EN PUNTO: ");
        fraseIngresada=leer.next();
        
        
        while(!fraseIngresada.endsWith(".")){
              System.out.println("Ingrese un punto . para finalizar");
              fraseIngresada=leer.next();
        }
        
        cambiarCaracteres(fraseIngresada);
        
    }
    
    public static void cambiarCaracteres(String frase){
       String fraseLower=frase.toLowerCase();
        fraseLower=fraseLower.replace('a','@');
        fraseLower= fraseLower.replace('e','@');
        fraseLower= fraseLower.replace('i','@');
        fraseLower= fraseLower.replace('o','@');
        
        System.out.println(fraseLower);
    }
    
    
    
  
}

