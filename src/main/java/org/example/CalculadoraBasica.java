package org.example;

import java.util.Scanner;

public class CalculadoraBasica {
    public static double calculate(int a, int b, char operation) {
        double result;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Error: Division por cero no permitida.");
                }
                result = (double) a / b;
                break;
            default:
                throw new IllegalArgumentException("Operacion no valida. Use +, -, * o /.");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo numero (b): ");
        int b = scanner.nextInt();

        System.out.print("Introduce la operacion (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        try {
            double result = calculate(a, b, operation);
            System.out.println("El resultado de " + a + " " + operation + " " + b + " es: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}
