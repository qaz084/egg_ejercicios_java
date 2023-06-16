/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_extra_1.servicios;

import java.util.Scanner;
import poo_ej_extra_1.entidades.Vehiculo;

/**
 *
 * @author jbi
 */
public class ServicioVehiculo {

    Scanner leer = new Scanner(System.in);

    public Vehiculo crearVehiculo() {
        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("Ingresa la marca del Vehiculo: ");
        vehiculo1.setMarca(leer.next());

        System.out.println("Ingresa el modelo del auto: ");
        vehiculo1.setModelo(leer.next());

        System.out.println("Ingresa el año del auto: ");
        vehiculo1.setAnio(leer.nextInt());

        System.out.println("Ingresa el tipo de auto: (AUTO MOTO BICI) ");
        String tipoVehiculo = leer.next().toUpperCase();

        while (!tipoVehiculo.equalsIgnoreCase("MOTO") && !tipoVehiculo.equalsIgnoreCase("AUTO") && !tipoVehiculo.equalsIgnoreCase("BICI")) {
            System.out.println("Tipo de vehiculo incorrecto, escribe AUTO, MOTO O BICI ");
            tipoVehiculo = leer.next().toUpperCase();
        }
        vehiculo1.setTipo(tipoVehiculo);

        return vehiculo1;
    }

    public void moverse(Vehiculo vehiculo) {
        String tipoVehiculo = vehiculo.getTipo();

        if (tipoVehiculo.equalsIgnoreCase("AUTO")) {
            calcularTiempo(tipoVehiculo);
//           
        } else if (tipoVehiculo.equalsIgnoreCase("MOTO")) {
            calcularTiempo(tipoVehiculo);
        } else {
            calcularTiempo(tipoVehiculo);
        }
    }

    public int frenar(Vehiculo vehiculo) {
        String tipoVehiculo = vehiculo.getTipo();
        int tiempoFrenada;

        if (tipoVehiculo.equalsIgnoreCase("AUTO")) {
            tiempoFrenada = calcularTiempoConFrenada(tipoVehiculo);
//           
        } else if (tipoVehiculo.equalsIgnoreCase("MOTO")) {
            tiempoFrenada = calcularTiempoConFrenada(tipoVehiculo);
        } else {
            tiempoFrenada = calcularTiempoConFrenada(tipoVehiculo);
        }

        return tiempoFrenada;

    }

    private void calcularTiempo(String tipovehiculo) {
        int cincoSegundos;
        int diezSegundos;
        int unMinuto;

        switch (tipovehiculo) {
            case "AUTO":
                cincoSegundos = 3 * 5;
                diezSegundos = 3 * 10;
                unMinuto = 60 * 3;
                System.out.println("En cinco segundos Avanzó " + cincoSegundos + " metros");
                System.out.println("En diez segundos Avanzó " + diezSegundos + " metros");
                System.out.println("En un minuto Avanzó " + unMinuto + " metros");
                break;
            case "MOTO":
                cincoSegundos = 2 * 5;
                diezSegundos = 2 * 10;
                unMinuto = 60 * 2;
           
                System.out.println("En cinco segundos Avanzó " + cincoSegundos + " metros");
                System.out.println("En diez segundos Avanzó " + diezSegundos + " metros");
                System.out.println("En un minuto Avanzó " + unMinuto + " metros");
                break;
            case "BICI":
                cincoSegundos = 1 * 5;
                diezSegundos = 1 * 10;
                unMinuto = 60 * 1;
               
                System.out.println("En cinco segundos Avanzó " + cincoSegundos + " metros");
                System.out.println("En diez segundos Avanzó " + diezSegundos + " metros");
                System.out.println("En un minuto Avanzó " + unMinuto + " metros");

                break;
            default:
                throw new AssertionError();
        }

    }

    private int calcularTiempoConFrenada(String tipovehiculo) {
        int resultadoCalculo;     
        System.out.println("");
        System.out.println("-----AL FRENAR-------");
        switch (tipovehiculo) {
            case "AUTO":
            
                resultadoCalculo = (5 * 60) * 3 + 2;          
                System.out.println("En cinco minutos Avanzó " + resultadoCalculo + " metros");
                break;
            case "MOTO":
              
                resultadoCalculo = (5 * 60) * 2 + 2;

                System.out.println("En cinco minutos Avanzó " + resultadoCalculo + " metros");
                break;
            case "BICI":
//               
                resultadoCalculo = (5 * 60) * 1;
//               
                System.out.println("En cinco minutos Avanzó " + resultadoCalculo + " metros");
                break;
            default:
                throw new AssertionError();
        }

        return resultadoCalculo;
    }

}
