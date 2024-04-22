package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los detalles del libro
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = scanner.nextInt();

        System.out.println("Ingrese el género del libro:");
        scanner.nextLine();
        
        String genero = scanner.nextLine();
        

        
        Libro libro = new Libro(titulo, autor, anoPublicacion, false, genero); 
        System.out.println("Información del libro:");
        System.out.println(libro.mostrarInformacion());
        System.out.println(libro.marcarLeido());
        System.out.println("El libro es antiguo: " + libro.esAntiguo());

        scanner.close();
    }
}
    
       
