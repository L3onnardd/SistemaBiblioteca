/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservalibro;

import java.util.Scanner;

/**
 *
 * @author leonn
 */
public class ReservaLibro {

      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== REGISTRO DE USUARIO ===");
        System.out.print("Ingrese el nombre del libro que desea reservar: ");
        String libro = entrada.nextLine();
                
        System.out.println("\n=== Libro reservado ===");
        System.out.println("Libro Reservado: " + libro);
        
        System.out.println("\n Registro exitoso");
        
        entrada.close();
    }
}