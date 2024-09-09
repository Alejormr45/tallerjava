package org.example;

import java.util.Scanner;

public class FactorialDeunNumero {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();

        try {
            long factorial = factorial(n);
            System.out.println("El factorial de " + n + " es: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
