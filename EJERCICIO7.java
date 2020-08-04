/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int valor_gas = 10000;
    int dist = 90 ;
    int klxviaj = 30;
    int viajs, gas, kl, galns,tot_galns, galxkm;
    
     Scanner Teclado = new Scanner (System.in);
     
     System.out.println("ingrese el valor de kilos");
     kl = Teclado.nextInt();
     System.out.println("ingrese el valor de galon por km");
     galxkm = Teclado.nextInt();
     
    viajs = (kl / klxviaj);
    System.out.println("estos viajes se deben hacer:"+viajs);
    
    galns = (2 * dist)* galxkm;
    tot_galns = galns * viajs;
    System.out.println("galones utilizados:"+tot_galns);
    gas = tot_galns * valor_gas;
    
     
    
     
     
    }
    
}
