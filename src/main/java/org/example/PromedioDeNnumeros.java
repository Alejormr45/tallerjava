package org.example;

import java.util.Scanner;

public class PromedioDeNnumeros {
    public static double CalcularPromedio(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

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

        double average = CalcularPromedio(numbers);
        System.out.println("El promedio de los " + n + " numeros es: " + average);

        scanner.close();
    }
}
