/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;

/**
 *
 * @author jbi
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioMascota sm =new ServicioMascota();
        Mascota m1 = sm.crearMascota();

//        m1.pasear(100);
//        System.out.println(m1.toString());
//        m1.pasear(100, 4);
        System.out.println(m1.toString());
        
        m1=null;
    }

}
