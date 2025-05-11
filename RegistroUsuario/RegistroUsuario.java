/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrousuario;

import java.util.Scanner;

/**
 *
 * @author leonn
 */
public class RegistroUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== REGISTRO DE USUARIO ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese su contrasena: ");
        String contrasena = entrada.nextLine();
        
        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Contrasena: " + contrasena);
        
        System.out.println("\n Registro exitoso");
        
        entrada.close();
    }
}