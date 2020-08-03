/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOO code application logic here
    double radio,area,volumen;
    
    Scanner Teclado = new Scanner (System.in);
    
    System.out.println("ingrese el valor del radio  ");
        radio = Teclado.nextInt();
        area = (double) (Math.PI * Math.pow(radio, 2));
        volumen = (double)((4.0/3.0)*(Math.PI) * (Math.pow(radio, 3)));
        System.out.println("el area del circulo es "+area);
        System.out.println("el volumen de una esfera es "+volumen);
    }
   
}
