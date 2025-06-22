package csc350;

public class Main {
    public static void main(String[] args) {
        // Create vehicle
        Automobile car = new Automobile("Mazda", "CX5", "Red", 2024);
        
        // Test methods
        System.out.println(car.DisplayInfo());   
        System.out.println(car.CheckYear());         
        
        System.out.println(car.RemoveVehicle(
            "Honda", "Accord", "Black", 2021));     
        
        System.out.println(car.RemoveVehicle(
            "Mazda", "CX5", "Red", 2024));       
            
        System.out.println(car.DisplayInfo());
    }
}
