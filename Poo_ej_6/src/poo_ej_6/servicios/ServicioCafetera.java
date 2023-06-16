/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_6.servicios;

import java.util.Scanner;
import poo_ej_6.dependencias.Cafetera;

/**
 *
 * @author jbi
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafetera1 = new Cafetera(0, 0);
        System.out.println("Ingrese la capacidad máxima de la cafetera en ML. (150 ML = 1 TAZA)");
        cafetera1.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de cafe: ('0' si está vacía) ");
        cafetera1.setCantidadActual(leer.nextInt());

        return cafetera1;
    }

    public void llenarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());
    }

    public void servirTaza(int tamanioTaza, Cafetera cafetera1) {
        System.out.println("Ingrese el tamaño de la taza en ML: ");
        tamanioTaza = leer.nextInt();
        int cantidadActual = cafetera1.getCantidadActual();
        if (cantidadActual >= tamanioTaza) {
            System.out.println("La taza está llena");
            cafetera1.setCantidadActual(cantidadActual -= tamanioTaza);

        } else if (cantidadActual < tamanioTaza) {
            System.out.println("La taza quedó con " + cantidadActual + " ML llenos");
            cafetera1.setCantidadActual(cantidadActual -= tamanioTaza);

        } else {
            System.out.println("La cafetera está vacía.");
        }
    }

    public void vaciarCafetera(Cafetera cafetera1) {
        cafetera1.setCantidadActual(0);
        System.out.println("La cafetera está vacía.");
    }

    public void agregarCafer(int cantCafe, Cafetera cafetera1) {
        System.out.println("¿Cuánto café quieres agregar? (en ML)");
        cantCafe = leer.nextInt();
        int cantidadActual = cafetera1.getCantidadActual();

        int capacidadParaLlenar = cafetera1.getCapacidadMaxima() - cantidadActual;
        if (cantCafe <= capacidadParaLlenar) {
            cafetera1.setCantidadActual(cantidadActual += cantCafe);
        }
    }
}
