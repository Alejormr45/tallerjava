package org.example;

import java.util.Scanner;

public class NumeroMasGrandeyMasPequeño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de numeros: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de numeros debe ser mayor que 0.");
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Introduce los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("El numero mas grande es: " + max);
        System.out.println("El numero mas pequeno es: " + min);

        scanner.close();
    }

}
