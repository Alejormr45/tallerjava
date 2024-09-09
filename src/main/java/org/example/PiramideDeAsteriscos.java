package org.example;

import java.util.Scanner;

public class PiramideDeAsteriscos {
    public static void drawPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de niveles de la piramide: ");
        int n = scanner.nextInt();

        drawPyramid(n);

        scanner.close();
    }

}
