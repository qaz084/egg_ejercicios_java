/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_1_persona;

import poo_ej_1_persona.entidades.Persona;

/**
 *
 * @author jbi
 */
public class Poo_ej_1_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona rocio= new Persona();
        Persona cecilia = new Persona("Cecilia");
        System.out.println(cecilia.nombre); 
        System.out.println(cecilia.edad); 
        System.out.println(rocio.nombre); 
    }
    
}
