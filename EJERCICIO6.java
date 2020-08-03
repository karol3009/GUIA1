/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double var_s, var_n,area;
        
        Scanner Teclado = new Scanner (System.in);
        
            System.out.println("ingrese el valor de la variable s");
                var_s = Teclado.nextDouble();
            System.out.println("ingrese el valor de la variable n");
                var_n = Teclado.nextDouble();
            area = (double) (var_n*(Math.pow(var_s,2)))/(4*(Math.tan(Math.PI/var_n)));
            System.out.println("el area del poligono regular es "+area);
    }
    
}
