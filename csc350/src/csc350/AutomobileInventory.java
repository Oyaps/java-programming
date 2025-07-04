package csc350;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            // Create automobile using parameterized constructor
            NewAutomobile auto = new NewAutomobile("Toyota", "Camry", "Blue", 2020, 15000);
            
            // List vehicle info
            System.out.println("\nInitial Vehicle Info:");
            for (String info : auto.listVehicleInformation()) {
                System.out.println(info);
            }
            
            // Remove vehicle
            System.out.println("\n" + auto.removeVehicle());
            
            // Add new vehicle
            System.out.println("\n" + auto.addNewVehicle("Honda", "Civic", "Red", 2022, 8000));
            
            // List new vehicle info
            System.out.println("\nNew Vehicle Info:");
            for (String info : auto.listVehicleInformation()) {
                System.out.println(info);
            }
            
            // Update attributes (partial update)
            System.out.println("\n" + auto.updateVehicleAttributes("", "", "Black", "2023", ""));
            
            // List updated info
            System.out.println("\nUpdated Vehicle Info:");
            for (String info : auto.listVehicleInformation()) {
                System.out.println(info);
            }
            
            // File output prompt
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nPrint information to file? (Y/N): ");
            String choice = scanner.nextLine().trim();
            
            if (choice.equalsIgnoreCase("Y")) {
                writeToFile(auto.listVehicleInformation());
            } else {
                System.out.println("File will not be printed.");
            }
            scanner.close();
            
        } catch (Exception e) {
            System.out.println("Inventory error: " + e.getMessage());
        }
    }
    
    private static void writeToFile(String[] vehicleInfo) {
        String filePath = "C:\\Temp\\Autos.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            new File("C:\\Temp").mkdirs();  // Ensure directory exists
            
            for (String info : vehicleInfo) {
                writer.write(info);
                writer.newLine();
            }
            System.out.println("File saved to: " + filePath);
        } catch (Exception e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }
}
