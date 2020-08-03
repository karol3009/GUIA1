/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vol_troncono, area_cono, altura1, altura2,radio;
        Scanner Teclado = new Scanner (System.in);
       
        System.out.println("Ingrese el valor del radio");
        radio = Teclado.nextInt();
        System.out.println("Ingrese el valor de la altura1");
        altura1 = Teclado.nextInt();
        System.out.println("Ingrese el valor de la altura2");
        altura2 = Teclado.nextInt();
        area_cono = (int) (Math.PI * Math.pow(radio,2));
        vol_troncono = area_cono *(altura1-altura2);
        System.out.println("el volumen del tronco de cono es:"+vol_troncono);
        
        
        
       
        
         
        
    } 
    
}
