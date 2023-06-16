/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_4;

import poo_ej_4.entidades.Rectangulo;
import poo_ej_4.servicios.ServicioRectangulo;

/**
 *
 * @author jbi
 */
public class Poo_ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioRectangulo sr =new ServicioRectangulo();
        Rectangulo rec1 = sr.crearRectangulo();
        sr.dibujarRectangulo(rec1);
    }
    
}
