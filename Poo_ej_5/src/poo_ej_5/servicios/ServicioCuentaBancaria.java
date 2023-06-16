/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_5.servicios;

import java.util.Scanner;
import poo_ej_5.entidades.CuentaBancaria;

/**
 *
 * @author jbi
 */
public class ServicioCuentaBancaria {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("Ingrese el número de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el DNI del cliente: ");
        cuenta1.setDniCliente(leer.nextLong());

        System.out.println("Ingrese el saldo actual: ");
        cuenta1.setSaldoActual(leer.nextInt());

        return cuenta1;
    }

    public void ingresarDinero(double ingreso, CuentaBancaria cuenta) {
        System.out.println("Cuánto dinero quieres ingresar?: ");
        ingreso = leer.nextInt();
        int nuevoSaldo = (int) (cuenta.getSaldoActual() + ingreso);
        cuenta.setSaldoActual(nuevoSaldo);
    }

    public void retirarDinero(double retiro, CuentaBancaria cuenta) {
        System.out.println("Cuánto dinero quieres retirar?: ");
        retiro = leer.nextInt();
        int saldoDisponible = cuenta.getSaldoActual();
        if (retiro > 0 && retiro <= saldoDisponible) {
            saldoDisponible -= retiro;
            cuenta.setSaldoActual(saldoDisponible);
        } else {
            System.out.println("No tienes saldo suficiente :(");
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        int saldo = cuenta.getSaldoActual();
        saldo -= saldo * 0.2;
        if (saldo > 0) {
            cuenta.setSaldoActual(saldo);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo de la cuenta es de: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        String infoCuenta = cuenta.toString();
        System.out.println("");
        System.out.println(infoCuenta);
    }
}
