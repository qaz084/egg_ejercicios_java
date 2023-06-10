/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Circunsferencia;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class ServicioCircunsferencia {
     Scanner leer = new Scanner(System.in);
     
    public Circunsferencia crearCircunsferencia(){
        System.out.println("Ingrese el radio de la circunsferencia: ");
        
        double radio= leer.nextDouble();
        Circunsferencia circunsferencia1= new Circunsferencia(radio);
        return circunsferencia1;
    }
    public  void area(Circunsferencia circ1){
        double radio= circ1.getRadio();
        double area= Math.round( Math.PI*Math.sqrt(radio));
        System.out.println("El área de la circunsferencia es de: " + area);
    }
    public void perimetro(Circunsferencia circ1){
        double radio= circ1.getRadio();
        double perimetro=Math.round((2*Math.PI)*Math.sqrt(radio));
        System.out.println("El perímetro de la circunsferencia es de: " + perimetro);
    }
}

