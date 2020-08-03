/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Karoline
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double latitud1,longitud1,latitud2,longitud2, distancia;
        Scanner Teclado = new Scanner (System.in);
         
        System.out.println("ingrese el valor de la latitud1: ");
        latitud1 = Teclado.nextDouble();
         
        System.out.println("ingrese el valor de la longitud1: ");
        longitud1 = Teclado.nextDouble();   
         
        System.out.println("ingrese el valor de la latitud2: ");
        latitud2 = Teclado.nextDouble();   
         
        System.out.println("ingrese el valor de la longitud2: ");
        longitud2 = Teclado.nextDouble();
        distancia = 6371.07*(Math.acos(latitud1))*(Math.sin(latitud2))+(Math.cos(latitud1))*(Math.cos(latitud2))*(Math.cos(longitud1-longitud2));
         System.out.println("la distancia es:" +distancia);
    }
    
}
