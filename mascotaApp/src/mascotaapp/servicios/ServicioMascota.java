/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author jbi
 */
public class ServicioMascota {
    
    private Scanner leer =new Scanner(System.in).useDelimiter("\n");
    public Mascota crearMascota(){
        System.out.println("Introducir nombre de la mascota: ");
        String nombre= leer.next();
        
        System.out.println("Introducir apodo de la mascota: ");
        String apodo= leer.next();
        
        System.out.println("Introducir qué tipo de mascota es: ");
        String tipo= leer.next();
        
        return new Mascota(nombre, apodo, tipo);
    }
    
 
}

