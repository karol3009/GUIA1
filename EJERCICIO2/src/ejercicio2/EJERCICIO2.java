/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Karoline
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millasgalones = 282.48;
    double num1 = 0;
    double litroskm;
     Scanner Teclado = new Scanner (System.in);   
     
    
    
    System.out.println("ingrese el valor que dese convertir  ");
        num1 = Teclado.nextDouble();
        litroskm = millasgalones/num1;
    
        System.out.println("el resultado es:" +litroskm);
    }
    
}
