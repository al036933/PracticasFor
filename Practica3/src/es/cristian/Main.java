package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, numeroDeDivisores = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número para comprobar si es primo: ");
        numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {

        }

        if (numeroDeDivisores == 0) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }
}