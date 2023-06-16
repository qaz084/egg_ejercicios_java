/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_8.servicios;

import java.util.Scanner;
import poo_ej_8.entidades.Cadena;

/**
 *
 * @author jbi
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena cadena1 = new Cadena();
        System.out.println("Ingresa una frase: ");
        String frase = leer.nextLine();
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());
        return cadena1;
    }

    public void mostrarVocales(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        int contador = 0;
        for (int j = 0; j < fraseIngresada.length(); j++) {
            char letra = fraseIngresada.charAt(j);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'
                    || letra == 'u') {
                contador++;
            }
        }
        System.out.println("La frase tiene: " + contador + " vocales.");

    }

    public void invertirFrase(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = fraseIngresada.length() - 1; i >= 0; i--) {

            fraseInvertida.append(fraseIngresada.charAt(i));

        }
        String resultado = fraseInvertida.toString();
        System.out.println("Frase invertida: " + resultado);
    }

    public void vecesRepetido(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        System.out.println("Ingresa un caracter para buscar: ");
        char letra = leer.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < fraseIngresada.length(); i++) {
            if (fraseIngresada.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + "'" + letra + "'" + " se repite " + contador + " veces");
    }

    public void compararLongitud(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        leer.nextLine();
        System.out.println("Ingrese una nueva frase: ");
        String nuevaFrase = leer.nextLine().toLowerCase();

        if (fraseIngresada.compareTo(nuevaFrase) == 0) {
            System.out.println("Las frases son iguales");
        } else {

            System.out.println("Las frases son distintas");
        }
    }

    public void unirFrases(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        System.out.println("Ingrese una frase para agregar: ");
        String nuevaFrase = leer.nextLine();
//        leer.nextLine();
        String frasesJuntas = fraseIngresada.concat(" " + nuevaFrase);

        System.out.println(frasesJuntas);
    }

    public void reemplazar(Cadena frase) {
        String fraseIngresada = frase.getFrase().toLowerCase();
        String fraseConReemplazo = "";
        boolean bandera = false;
        System.out.println("Por cual letra quiere reemplazar las 'a'?");
        char letraReemplazo = Character.toLowerCase(leer.next().charAt(0));
        for (int i = 0; i < fraseIngresada.length(); i++) {
            char oldChar = fraseIngresada.charAt(i);
            if (oldChar == 'a') {
                bandera = true;
                leer.nextLine();
                fraseConReemplazo = fraseIngresada.replace(oldChar, letraReemplazo);
            }
        }
        if (!bandera) {
            System.out.println("No hay letras 'a' en la frase");
        }
        System.out.println(fraseConReemplazo);
    }
    public void contiene(Cadena frase){
         String fraseIngresada = frase.getFrase().toLowerCase();
         System.out.println("¿Qué letra quieres saber si está en la frase?");
        char letraBuscada = Character.toLowerCase(leer.next().charAt(0));
 
        if(fraseIngresada.contains(String.valueOf(letraBuscada))){
            System.out.println("La letra está en la frase.");
        }else{
            System.out.println("La letra no está en la frase.");
        }
    }
}
