/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_1;

import poo_ej_1.entidades.Libro;
import poo_ej_1.servicios.ServicioLibro;

/**
 *
 * @author jbi
 */
public class Poo_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioLibro sl =new ServicioLibro();
        Libro libro1 = sl.cargarDatosLibro();
        sl.mostrarLibro(libro1);
    }
    
}
