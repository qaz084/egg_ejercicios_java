/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_v2.servicios;

import java.util.Scanner;
import poo_ej_v2.entidad.Circunferencia;

/**
 *
 * @author jbi
 */
public class ServicioCircunsferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunsferencia() {

        Circunferencia circunferencia1 = new Circunferencia(0);
        System.out.println("Ingresa el radio de la circunferencia: ");
        double radio = leer.nextDouble();
        circunferencia1.setRadio(radio);

        return circunferencia1;
    }

    public void calcularArea(Circunferencia circunferencia1) {
        double radio = circunferencia1.getRadio();
        double area = Math.PI * (Math.sqrt(radio));
        System.out.println("El área de la circunferencia es: " + area);
    }

    public void perimetro(Circunferencia circunferencia1) {
        double radio = circunferencia1.getRadio();
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro es: " + perimetro);
    }
}
