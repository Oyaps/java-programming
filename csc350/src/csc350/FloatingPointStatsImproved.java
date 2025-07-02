package csc350;


import java.util.Scanner;
import java.util.InputMismatchException;

public class FloatingPointStatsImproved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter five floating-point values (e.g., 1.5, 2.75, 3.0, 4.25, 5.5):");
        double[] values = getInputValues(scanner, 5);
        
        double total = calculateTotal(values);
        double average = calculateAverage(total, values.length);
        double max = findMax(values);
        double min = findMin(values);
        double interest = calculateInterest(total, 0.20);
        
        displayResults(total, average, max, min, interest);
        
        scanner.close();
    }

    // Reads valid floating-point values from user
    private static double[] getInputValues(Scanner scanner, int countRequired) {
        double[] values = new double[countRequired];
        int count = 0;
        
        while (count < countRequired) {
            System.out.print("Value #" + (count + 1) + ": ");
            
            try {
                double value = scanner.nextDouble();
                values[count] = value;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (e.g., 3.14).");
                scanner.next();
            }
        }
        return values;
    }

    // Calculates sum of values
    private static double calculateTotal(double[] values) {
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total;
    }

    // Finds maximum value
    private static double findMax(double[] values) {
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    // Finds minimum value
    private static double findMin(double[] values) {
        double min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    // Calculates average
    private static double calculateAverage(double total, int count) {
        return total / count;
    }

    // Calculates interest
    private static double calculateInterest(double amount, double rate) {
        return amount * rate;
    }

    // Displays formatted results
    private static void displayResults(double total, double average, 
                                     double max, double min, double interest) {
        System.out.println("\nResults:");
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest (20%%): %.2f\n", interest);
    }
}
