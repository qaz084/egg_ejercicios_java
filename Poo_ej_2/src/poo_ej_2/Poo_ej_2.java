/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_2;

import entidades.Circunsferencia;
import servicios.ServicioCircunsferencia;

/**
 *
 * @author jbi
 */
public class Poo_ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCircunsferencia sc= new ServicioCircunsferencia();
        Circunsferencia circunsferencia1= sc.crearCircunsferencia();
        
        sc.area(circunsferencia1);
        sc.perimetro(circunsferencia1);
    }
    
}
