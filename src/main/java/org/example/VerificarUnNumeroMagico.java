package org.example;

import java.util.Scanner;

public class VerificarUnNumeroMagico {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isMagicNumber(int n) {
        // Convertir el número a valor absoluto para manejar números negativos
        n = Math.abs(n);

        // Reducir el número a un solo dígito sumando los dígitos repetidamente
        while (n >= 10) {
            n = sumOfDigits(n);
        }

        // Verificar si el único dígito resultante es 1
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        boolean isMagic = isMagicNumber(n);
        if (isMagic) {
            System.out.println(n + " es un número mágico.");
        } else {
            System.out.println(n + " no es un número mágico.");
        }

        scanner.close();
    }

}
