package org.example;

import java.util.Scanner;

public class MinimoComoUnMultiplo {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int b = scanner.nextInt();

        int result = lcm(a, b);
        System.out.println("El MCM de " + a + " y " + b + " es: " + result);

        scanner.close();
    }


}
