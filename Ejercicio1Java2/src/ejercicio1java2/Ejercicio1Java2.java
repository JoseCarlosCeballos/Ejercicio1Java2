/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1java2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio1Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota del primer examen: ");
        x = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre? ");
        z = sc.nextDouble();
        
        y = (z - (x*0.4)) / 0.6;
        
        System.out.println("Para tener un " +z+ " en el trimestre necesitas sacar un " +y+ " en el segundo examen");
        
    }
    
}
