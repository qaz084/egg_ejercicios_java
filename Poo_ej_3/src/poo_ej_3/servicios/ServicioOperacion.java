/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_3.servicios;

import java.util.Scanner;
import poo_ej_3.entidades.Operacion;

/**
 *
 * @author jbi
 */
public class ServicioOperacion {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion op1=new Operacion();
        System.out.println("Ingresa el Numero 1: ");
        op1.setNumero1(leer.nextInt());
        System.out.println("Ingresa el Numero 2: ");
        op1.setNumero2(leer.nextInt());
        return op1;
    }
    
    public int sumar(Operacion op1){
       int resultadoSuma= op1.getNumero1()+op1.getNumero2();
       return resultadoSuma;
        
    }
    public int restar(Operacion op1){
            int resultadoResta= op1.getNumero1()-op1.getNumero2();
       return resultadoResta;
    }
    public int multiplicar(Operacion op1){
            int resultadoMultiplicacion= op1.getNumero1()*op1.getNumero2();
       return resultadoMultiplicacion;
    }
    public double dividir(Operacion op1){
        if(op1.getNumero1()==0 || op1.getNumero2()==0){
            System.out.println("Uno de los números es cero, no se puede dividir.");
        }
       double resultadoDivision= op1.getNumero1()/op1.getNumero2();
       return resultadoDivision;
    }
}
