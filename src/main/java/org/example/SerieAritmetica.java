package org.example;

import java.util.Scanner;

public class SerieAritmetica {

    public static int sumArithmeticSeries(int n, int a, int d) {

        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de terminos (n): ");
        int n = scanner.nextInt();

        System.out.print("Introduce el primer termino (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce la diferencia comun (d): ");
        int d = scanner.nextInt();

        int sum = sumArithmeticSeries(n, a, d);
        System.out.println("La suma de los primeros " + n + " terminos de la serie aritmetica es: " + sum);

        scanner.close();
    }


}
