/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
 /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
package com.mycompany.ej_14;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Ej_14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int euros;
        int menu;
        double aux;
        System.out.println("Decime la cantidad de euros a cambiar hdp");
        euros = leer.nextInt();

        System.out.println("Convertir a: \n1-Libra\n2-Yenes\n3-Dólares");
        menu = leer.nextInt();

        switch (menu) {
            case 1:
                aux = 0.86;
                multi(euros, aux);
                break;
            case 2:
                aux = 129.852;
                multi(euros, aux);
                break;
            case 3:
                aux = 1.28611;
                multi(euros, aux);
                break;
            default:
                System.out.println("Escribiste cualquiera");
        }
    }

    public static void multi(int euros, double aux) {
        System.out.println("La conversión da: " + euros * aux);
    }
}
