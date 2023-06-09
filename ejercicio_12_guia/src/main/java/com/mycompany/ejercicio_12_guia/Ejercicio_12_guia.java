/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio_12_guia;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ejercicio_12_guia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //DECLARACION--------------------------
        String aux1, aux2, frase, FDE;
        int contadorCorrectas, contadorIncorrectas;
        contadorCorrectas = 0;
        contadorIncorrectas = 0;

        //INICIALIZACIÓN-----------------------
        FDE = "&&&&&";
        
        do {
            System.out.println("Ingresa una cadena que empiece con X y termine con O");
            frase = leer.next();
            aux1 = frase.substring(0, 1);
            aux2 = frase.substring(frase.length() - 1, frase.length());

            if (frase.length() <= 5 && (aux1.equals("x")) && (aux2.equals("o"))) {
                contadorCorrectas++;
                System.out.println("Frase correcta ");
            } else {
                contadorIncorrectas++;
                System.out.println("Frase incorrecta");
            }

        } while (!frase.equals(FDE));

        System.out.println("Intentos correctos: " +" "+ contadorCorrectas);
        System.out.println("Intentos incorrectos: " + contadorIncorrectas);

    }
}


//EJ12
//        int correctos = 0;
//        int incorrectos = 0;
//        while (true){
//        String rs232 = leer.next();
//        if (rs232.length() != 5 && !rs232.equals("&&&&&")){
//            System.out.println("No valido");
//            incorrectos++;
//        }
//        else if (rs232.charAt(0) != 'X' && !rs232.equals("&&&&&")){
//            System.out.println("No valido");
//            incorrectos++;
//        }
//        else if (rs232.charAt(4) != 'O' && !rs232.equals("&&&&&")){
//            System.out.println("No valido");
//            incorrectos++;
//        }
//        else if (!rs232.equals("&&&&&"))
//        correctos++;
//        else
//        break;
//       };
//        System.out.println("Correctos: " + correctos + " Incorrectos: " + incorrectos);
//        
//        System.out.println("Ingrese entero");
//        int lado = leer.nextInt();
//        for (int i = 0; i<lado; i++)
//        {
//            for (int j = 0; j<lado; j++){
//                if (i == 0 || i == lado-1 || j==0 || j == lado-1 )
//                System.out.print("*");
//                else
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
