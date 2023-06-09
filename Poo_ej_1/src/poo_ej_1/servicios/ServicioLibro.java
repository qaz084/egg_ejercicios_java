/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ej_1.servicios;

import java.util.Scanner;
import poo_ej_1.entidades.Libro;

/**
 *
 * @author jbi
 */
public class ServicioLibro {

     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarDatosLibro() {
        
        Libro libro1 = new Libro();

        System.out.println("Ingresa el ISBN del libro: ");
        libro1.setIsbn(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingresa el TITULO del libro: ");
        libro1.setTitulo(leer.nextLine());
        
        System.out.println("Ingresa el AUTOR del libro: ");
        libro1.setAutor(leer.nextLine());
        
        System.out.println("Ingresa LA CANTIDAD DE PÁGINAS del libro: ");
        libro1.setNumeroDePaginas(leer.nextInt());
        
        return libro1;

    }
       public void mostrarLibro(Libro libro1){
           System.out.println("");
           System.out.println("El ISBN del libro es: "+ libro1.getIsbn());
           
           System.out.println("El TITULO del libro es: "+ libro1.getTitulo());
           
           System.out.println("El AUTOR del libro es: "+ libro1.getAutor());
           
           System.out.println("LA CANTIDAD DE PÁGINAS del libro es: "+ libro1.getNumeroDePaginas());
    }
   

}
