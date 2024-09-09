package org.example;

public class DescuentoParaClientes {
    // Método para calcular el nuevo total después de aplicar el descuento
    public static double calculateDiscount(double amount, double discountRate) {
        return amount * (1 - discountRate);
    }

    // Método para procesar los montos y aplicar descuentos según el umbral
    public static void applyDiscounts(double[] amounts, double threshold, double discountRate) {
        System.out.println("Clientes con descuento aplicado:");

        for (int i = 0; i < amounts.length; i++) {
            double originalAmount = amounts[i];
            if (originalAmount >= threshold) {
                double newAmount = calculateDiscount(originalAmount, discountRate);
                System.out.printf("Cliente %d: Monto original = %.2f, Monto con descuento = %.2f\n",
                        i + 1, originalAmount, newAmount);
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplo de montos de compras y parámetros
        double[] purchaseAmounts = {150.00, 300.00, 90.00, 250.00, 400.00};
        double threshold = 200.00; // Umbral para aplicar el descuento
        double discountRate = 0.10; // 10% de descuento

        applyDiscounts(purchaseAmounts, threshold, discountRate);
    }

}
