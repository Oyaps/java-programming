package csc350;

import java.util.Scanner;

public class groceryBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get coupon amount
        System.out.print("Enter coupon discount as decimal (e.g., 0.10 for 10%): ");
        double coupon = scanner.nextDouble();
        
        if (coupon <= 0 || coupon > 1.0) {
            System.out.println("Invalid coupon. Setting to default 10% discount.");
            coupon = 0.10;
        }
        
        // Get weekly bills
        double[] weeklyBills = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter grocery bill for Week %d: $", i + 1);
            weeklyBills[i] = scanner.nextDouble();
        }
        
        // Calculate totals
        double monthlyTotal = 0;
        for (double bill : weeklyBills) {
            monthlyTotal += bill;
        }
        
        double weeklyAverage = monthlyTotal / 4;
        double monthlyWithCoupon = monthlyTotal * (1 - coupon);
        double weeklyWithCoupon = monthlyWithCoupon / 4;
        
        // Display without coupon results
        System.out.printf("\n--- Without Coupon ---\n");
        System.out.printf("Monthly Total: $%.2f\n", monthlyTotal);
        System.out.printf("Weekly Average: $%.2f\n", weeklyAverage);
        
        // Display without coupon results
        System.out.printf("\n--- With %.0f%% Coupon ---\n", coupon * 100);
        System.out.printf("Monthly Total: $%.2f\n", monthlyWithCoupon);
        System.out.printf("Weekly Average: $%.2f\n", weeklyWithCoupon);
        
        scanner.close();
    }
}
