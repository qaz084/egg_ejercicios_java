/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import ej_integrador_sueldos.Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class VendedorServicio {
    Scanner leer = new Scanner(System.in);
    public Vendedor altaVendedor() {
        
        Vendedor v1 = new Vendedor();

        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor: ");
        v1.setSueldoBasico(leer.nextDouble());

        System.out.println("Ingrese el día que comenzó a trabajar el vendedor: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzó a trabajar el vendedor: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que comenzó a trabajar el vendedor: ");
        int anio = leer.nextInt();

        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fechaInicio);
        return v1;

    }

    public void sueldoMensual(Vendedor v1) {
        System.out.println("¿Cuáles fueron las ventas totales del vendedor? ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("\n Le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {

            System.out.println("Le corresponden 21 dias");
        }else if(antiguedad<20){
            System.out.println("Le corresponden 28 dias");
        }else if(antiguedad>20){
            System.out.println("Le corresponden 35 dias");
            
        }else{
            System.out.println("El empleado va a tener vacaciones proporcionales");
        }
    }
}
