package csc350;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FloatingPointStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double average = 0.0;
        double max = -Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        double interest = 0.0;
        int count = 0;

        System.out.println("Enter five floating-point values:");
        
        while (count < 5) {
            System.out.print("Value #" + (count + 1) + ": ");
            try {
                double value = scanner.nextDouble();
                total += value;
                
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
        
        average = total / 5.0;
        interest = total * 0.20;
        
        System.out.println("\nResults:");
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest (20%%): %.2f\n", interest);
        
        scanner.close();
    }
}