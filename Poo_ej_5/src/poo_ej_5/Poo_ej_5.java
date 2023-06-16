/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_5;

import poo_ej_5.entidades.CuentaBancaria;
import poo_ej_5.servicios.ServicioCuentaBancaria;

/**
 *
 * @author jbi
 */
public class Poo_ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCuentaBancaria sc = new ServicioCuentaBancaria();
        CuentaBancaria cuenta1 = sc.crearCuenta();
        sc.ingresarDinero(0,cuenta1);
        sc.consultarSaldo(cuenta1);
//        sc.retirarDinero(0, cuenta1);
//        sc.consultarSaldo(cuenta1);
        sc.extraccionRapida(cuenta1);
         sc.consultarSaldo(cuenta1);
        sc.consultarDatos(cuenta1);
       
        
    }
    
}
