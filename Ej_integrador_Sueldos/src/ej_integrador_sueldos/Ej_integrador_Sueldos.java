/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_integrador_sueldos;

import Servicios.VendedorServicio;
import ej_integrador_sueldos.Entidades.Vendedor;

/**
 *
 * @author jbi
 */
public class Ej_integrador_Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendedorServicio vs= new VendedorServicio();
        Vendedor v1 =vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
