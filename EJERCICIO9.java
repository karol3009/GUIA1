/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Karoline
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        int estu_gordos,estu_flacos,num_dias = 0,num_buses,total_gordos, total_pueocup,total_platosgor,total_platosfla,total_platoscons;
        int costototal_comidadiaria,costototal_comida, num_habit, total_est, costototal_habita;
        int plat_comida = 10000;
            int habi_dia = 25000;
             Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese cuantos estudiantes gordos van: ");
        estu_gordos = Teclado.nextInt();
        System.out.println("Ingrese cuantos estudiantes flacos van: ");
        estu_flacos = Teclado.nextInt();
        System.out.println("Ingrese el numero de dias que van a ir: ");
         num_dias = Teclado.nextInt();
        total_est = estu_gordos + estu_flacos; 
        total_gordos = estu_gordos*2;
        total_pueocup = total_gordos + estu_flacos;
        System.out.println("El total de puestos que ocupan los estudiantes es: " +total_pueocup);
        if (total_pueocup <= 60){
        System.out.println("se utiliza 1 bus");
        }
        else{
        System.out.println("se necesitarian 2 buses ");
                }
        total_platosgor = estu_gordos*5;
        total_platosfla = estu_flacos*3;
        total_platoscons =total_platosgor + total_platosfla;
            System.out.println("el total de platos comidos al dia es de: "+total_platoscons);
        costototal_comidadiaria = total_platoscons*10000  ;
        costototal_comida = costototal_comidadiaria * num_dias;
            System.out.println("el costo total de comida durante el paseo es de: "+costototal_comida);
         num_habit = (total_est / 4);
        System.out.println("el numero de habitaciones utilizadas es: "+num_habit);
        costototal_habita = num_habit * habi_dia * num_dias;
        System.out.println("el costo total de hospedaje es: "+costototal_habita);
                }
        
    }
    

