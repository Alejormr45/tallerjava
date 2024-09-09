package org.example;

import java.util.Scanner;

public class BucleDeSumaHastaCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Introduce una serie de numeros (termina con 0):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("La suma de los numeros ingresados es: " + sum);
        scanner.close();
    }

}
