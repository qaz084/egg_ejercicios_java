/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ej_3;

import com.sun.media.sound.SoftAbstractResampler;
import poo_ej_3.entidades.Operacion;
import poo_ej_3.servicios.ServicioOperacion;

/**
 *
 * @author jbi
 */
public class Poo_ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioOperacion so=new ServicioOperacion();
        Operacion op1=  so.crearOperacion();
       int resultadoSuma= so.sumar(op1);
        System.out.println("El resultado de la suma es: "+resultadoSuma);
        
        int resultadoResta= so.restar(op1);
        System.out.println("El resultado de la resta es: "+resultadoResta);
        
       int resultadoMultiplicacion= so.multiplicar(op1);
        System.out.println("El resultado de la multiplicación es de :"+resultadoMultiplicacion);
        
        int resultadoDivision= so.dividir(op1);
        System.out.println("El resultado de la division es: "+resultadoDivision);
        
    }
    
}
