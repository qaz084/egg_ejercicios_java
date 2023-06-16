/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_extra_1;

import poo_ej_extra_1.entidades.Vehiculo;
import poo_ej_extra_1.servicios.ServicioVehiculo;

/**
 *
 * @author jbi
 */
public class Poo_ej_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ServicioVehiculo sv = new ServicioVehiculo();
        int frenadaAuto1;
        int frenadaAuto2;
        int frenadaAuto3;

        Vehiculo vehiculo1 = sv.crearVehiculo();
        Vehiculo vehiculo2 = sv.crearVehiculo();
        Vehiculo vehiculo3 = sv.crearVehiculo();

//        sv.moverse(vehiculo1);
        frenadaAuto1 = sv.frenar(vehiculo1);
        frenadaAuto2 = sv.frenar(vehiculo2);
        frenadaAuto3 = sv.frenar(vehiculo3);
        System.out.println("--------------------");

        if (frenadaAuto1 > frenadaAuto2 && frenadaAuto1 > frenadaAuto3) {
            System.out.println("El vehiculo 1 llego màs lejos, avanzó " + frenadaAuto1 + " metros");
        } else if (frenadaAuto2 > frenadaAuto1 && frenadaAuto2 > frenadaAuto3) {
            System.out.println("El vehiculo 2 llego màs lejos, avanzó " + frenadaAuto2 + " metros");
        } else {
            System.out.println("El vehiculo 3 llego màs lejos, avanzó " + frenadaAuto3 + " metros");
        }

    }

}
