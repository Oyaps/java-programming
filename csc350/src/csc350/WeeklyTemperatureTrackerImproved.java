package csc350;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeeklyTemperatureTrackerImproved {
    public static void main(String[] args) {
        // Initialize ArrayLists for days and temperatures
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        ));
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Input temperatures for each day with validation
        for (String day : days) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter average temperature for " + day + ": ");
                String input = scanner.nextLine().trim();
                
                try {
                    double temp = Double.parseDouble(input);
                    temperatures.add(temp);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numerical value.");
                }
            }
        }
        
        // Prompt for query
        System.out.print("\nEnter a day (e.g., Monday) or 'week': ");
        String input = scanner.nextLine().trim();
        
        // Process input
        if (input.equalsIgnoreCase("week")) {
            double total = 0.0;
            System.out.println("\nWeekly Temperature Report:");
            for (int i = 0; i < days.size(); i++) {
                System.out.printf("%-10s: %.1f°F%n", days.get(i), temperatures.get(i));
                total += temperatures.get(i);
            }
            System.out.printf("Weekly Average: %.2f°F%n", total / days.size());
        } else {
            int index = -1;
            // Case-insensitive search for the day
            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).equalsIgnoreCase(input)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.printf("%nTemperature on %s: %.1f°F%n", 
                                  days.get(index), temperatures.get(index));
            } else {
                System.out.println("Error: Invalid day entered.");
            }
        }
        scanner.close();
    }
}