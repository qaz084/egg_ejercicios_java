/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_7;

import poo_ej_7.entidades.Persona;
import poo_ej_7.servicios.ServicioPersona;

/**
 *
 * @author jbi
 */
public class Poo_ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona sp = new ServicioPersona();
        Persona persona1 = sp.crearPersona();
        Persona persona2 = sp.crearPersona();

        sp.calcularIMC(persona1);
        sp.esMayorDeEdad(persona1);
        sp.calcularIMC(persona2);
        sp.esMayorDeEdad(persona2);

    }

}
