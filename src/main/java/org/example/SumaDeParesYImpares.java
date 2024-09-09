package org.example;

import java.util.Scanner;

public class SumaDeParesYImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de numeros: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de numeros debe ser mayor que 0.");
            return;
        }

        int[] numbers = new int[n];
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Introduce los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }

        System.out.println("La suma de los numeros pares es: " + sumEven);
        System.out.println("La suma de los numeros impares es: " + sumOdd);

        scanner.close();
    }

}
