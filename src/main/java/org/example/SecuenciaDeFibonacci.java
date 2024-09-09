package org.example;

import java.util.Scanner;

public class SecuenciaDeFibonacci {

    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("El numero de terminos debe ser mayor que 0.");
            return;
        }


        int a = 0, b = 1;


        System.out.print("Secuencia de Fibonacci con " + n + " terminos: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");


            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de terminos de la secuencia de Fibonacci: ");
        int n = scanner.nextInt();

        generateFibonacci(n);

        scanner.close();
    }

}
