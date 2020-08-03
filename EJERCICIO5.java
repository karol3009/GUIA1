/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m, c, t, q;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de m");
        m = Teclado.nextInt();
        System.out.println("Ingrese el valor de c");
        c = Teclado.nextInt();
        System.out.println("Ingrese el valor de t");
        t = Teclado.nextInt();
        q = m*c*t;
        System.out.println( "la cantidad total de energia es:"+q);
        
    }
    
}
