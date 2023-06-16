/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_7.servicios;

import java.util.Scanner;
import poo_ej_7.entidades.Persona;

/**
 *
 * @author jbi
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
     
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo: (H | M | O)");
        char sexo = leer.next().charAt(0);
        char sexoUpper = Character.toUpperCase(sexo);
        while (sexoUpper != 'H' && sexoUpper != 'M' && sexoUpper != 'O') {
            System.out.println("Ingresa una letra correcta: ");
            sexo = leer.next().charAt(0);
            sexoUpper = Character.toUpperCase(sexo);

        }
        persona.setSexo(sexoUpper);
        System.out.println("Ingresa el peso de la persona: ");
        persona.setPeso(leer.nextDouble());

        System.out.println("Ingresa la altura de la persona: ");
        persona.setPeso(leer.nextDouble());

        return persona;
    }

    public void calcularIMC(Persona persona) {

        double imc = persona.getPeso() / (Math.sqrt(persona.getAltura()));
        if (imc < 20) {
            System.out.println("Por debajo del peso ideal");

        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso ideal");

        } else {
            System.out.println("Sobrepeso");

        }

    }

    public void esMayorDeEdad(Persona p) {
        if (p.getEdad() > 18) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}
