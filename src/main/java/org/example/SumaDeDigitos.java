package org.example;

import java.util.Scanner;

public class SumaDeDigitos {
    public static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();

        int result = sumOfDigits(n);
        System.out.println("La suma de los digitos de " + n + " es: " + result);

        scanner.close();
    }

}
