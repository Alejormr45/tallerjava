package org.example;

import java.util.Scanner;

public class ConteoDeDigitos {
    public static int countDigits(int n) {
        // Convertir el número a valor absoluto para manejar números negativos
        n = Math.abs(n);

        // Si el número es 0, tiene 1 dígito
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;  // Elimina el último dígito del número
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        int digitCount = countDigits(n);
        System.out.println("El número de dígitos en " + n + " es: " + digitCount);

        scanner.close();
    }

}
