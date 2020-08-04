/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num_turis,total_pagar, numper_hotel, numviajes;
        double pago_turis = 10000;
        double valor_viaj= 2000;
        
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el numero de personas se caben en el colectivo ");
        num_turis = Teclado.nextInt();
        System.out.println("Ingrese el numero de personas que se hospedan en el hotel");
        numper_hotel = Teclado.nextInt();
        total_pagar = num_turis * pago_turis; 
        System.out.println("El total a pagar de los turistas es: " +total_pagar);
        if ( numper_hotel <= 45){
        System.out.println("debe realizar 1 viaje");
        }
        else{
        System.out.println("el colectivo debe realizar 2 viajes ");
        
     
    }
    }
}
    

