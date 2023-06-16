/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_8;

import poo_ej_8.entidades.Cadena;
import poo_ej_8.servicios.ServicioCadena;

/**
 *
 * @author jbi
 */
public class Poo_ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCadena sc = new ServicioCadena();
        Cadena cadena1 = sc.crearCadena();
        sc.mostrarVocales(cadena1);
        sc.invertirFrase(cadena1);
        sc.vecesRepetido(cadena1);
        sc.compararLongitud(cadena1);
        sc.unirFrases(cadena1);
        sc.reemplazar(cadena1);
        sc.contiene(cadena1);
    }
    
}
