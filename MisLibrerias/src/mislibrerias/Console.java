/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mislibrerias;

import java.util.Scanner;

/**
 *
 * @author jbi
 */
public class Console {
    private static Scanner input =new Scanner(System.in);
    
    private Console(){};
    
    public static void write(Object x){
        System.out.println(x);
    }
    public static String read(Object x){
        
        return input.nextLine();
    }
    
}
