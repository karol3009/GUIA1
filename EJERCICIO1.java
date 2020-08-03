/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    
        
        int var_a,var_b,suma,diferencia,producto,cociente,residuo;
        double length ,potencia;
            Scanner Teclado = new Scanner (System.in);   
                 
        System.out.println("ingrese la variable a  ");
        var_a = Teclado.nextInt();
        System.out.println("ingrese la variable b  ");
        var_b = Teclado.nextInt();
        suma = var_a+var_b;
        System.out.println("el resultado de la suma es:" +suma);
        diferencia = var_b-var_a;
        System.out.println("el resultado de la diferencia es:" +diferencia);
        producto = var_a*var_b;
        System.out.println("el resultado del producto es:" +producto);
        cociente = var_a/var_b;
        System.out.println("el resultado del cociente es:" +cociente);
        residuo = var_a%var_b;
        System.out.println("el resultado del residuo es:" +residuo);
     
        length = (double)(Math.log10(var_a +1));
        System.out.println("el resultado del logaritmo de a es:" +length);
        
        potencia = Math.pow(var_a, var_b);
        System.out.println("el resultado de la potencia es:" +potencia);
  
    } 
}


  