/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_4.servicios;

import java.util.Scanner;
import poo_ej_4.entidades.Rectangulo;

/**
 *
 * @author jbi
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        System.out.println("Ingresa la base del rectángulo: ");
        double base = leer.nextDouble();
        System.out.println("Ingresa la altura del rectángulo: ");
        double altura = leer.nextDouble();

        Rectangulo rec1 = new Rectangulo(base, altura);

        return rec1;
    }

    public void calcularSuperficie(Rectangulo rec1) {
        double superficie = rec1.getBase() * rec1.getAltura();
        System.out.println("");
        System.out.println("La superficie del rectángulo es: " + superficie);
    }

    public void calcularPerimetro(Rectangulo rec1) {
        double perimetro = (rec1.getBase() * rec1.getAltura()) / 2;
        System.out.println("");
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rec1) {
        for (int i = 0; i < rec1.getAltura(); i++) {
            for (int j = 0; j <rec1.getBase() ; j++) {
//               if(j==0 || j==rec1.getBase() ){
//                    System.out.print(" *");
//               }
                if (i == 0) {
                    System.out.print(" *");

                } 
                else if (i == rec1.getAltura()-1) {
                    System.out.print(" *");
                }else{
                     if (j == 0 || j == rec1.getBase()-1) {
                    System.out.print(" *");
                }else{
                         System.out.print("  ");
                     }
                }
               

            }
            System.out.println("");

        }
    }
}
