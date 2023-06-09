/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_1_persona.entidades;

/**
 *
 * @author jbi
 */
public class Persona {

    //ATRIBUTOS
    public String nombre;
    public int edad;
    
    //CONSTRUCTORES
    public Persona() {
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
//        this.edad = edad;
    }
    
     //METODOS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
