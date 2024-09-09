package org.example;

import java.util.Scanner;

public class ContadorDeVocales {

    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String text = scanner.nextLine();

        int numberOfVowels = countVowels(text);
        System.out.println("La cadena de texto contiene " + numberOfVowels + " vocales.");

        scanner.close();
    }

}
