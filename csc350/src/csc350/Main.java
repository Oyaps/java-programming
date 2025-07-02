package csc350;

public class Main {
    public static void main(String[] args) {
        // Create vehicle using improved class
        AutomobileImproved car = new AutomobileImproved("Mazda", "CX5", "Red", 2024);
        
        // Test methods
        System.out.println(car.displayInfo());
        System.out.println(car.checkYear());
        
        // Test updates
        System.out.println(car.updateColor("Blue"));
        System.out.println(car.updateMake("Toyota"));
        System.out.println(car.updateModel("Camry"));
        System.out.println(car.updateYear(2022));
        System.out.println(car.displayInfo());
        
        // Test removal
        System.out.println(car.removeVehicle("Honda", "Accord", "Black", 2021));
        System.out.println(car.removeVehicle("Toyota", "Camry", "Blue", 2022));
        
        // Test post-removal operations
        System.out.println(car.displayInfo());
        System.out.println(car.checkYear());
        System.out.println(car.updateColor("Green"));
        
        // Fixed validation tests - no unused variables
        testValidation();
    }
    
    private static void testValidation() {
        // Test empty make
        try {
            new AutomobileImproved("", "Model", "Color", 2020);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
        
        // Test invalid year
        try {
            new AutomobileImproved("Make", "Model", "Color", 3000);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
        
        // Test null color
        try {
            new AutomobileImproved("Make", "Model", null, 2020);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
    }
}