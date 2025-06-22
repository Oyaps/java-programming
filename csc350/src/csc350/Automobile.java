package csc350;

public class Automobile {
    // Private variables to store vehicle data
    private String make;
    private String model;
    private String color;
    private int year;

    // Initialize vehicle properties
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // RemoveVehicle
    public String RemoveVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (autoMake.equals(make) && 
            autoModel.equals(model) && 
            autoColor.equals(color) && 
            autoYear == year) {
            
            make = null;
            model = null;
            color = null;
            year = 0;
            return "Vehicle removed successfully";
        } else {
            return "Error: Vehicle details mismatch";
        }
    }

    // UpdateColor
    public String UpdateColor(String newColor) {
        color = newColor;
        return "Color updated to " + newColor;
    }

    // DisplayInfo
    public String DisplayInfo() {
        if (make != null) {
            return year + " " + make + " " + model + " (" + color + ")";
        } else {
            return "No vehicle data available";
        }
    }

    // CheckYear
    public String CheckYear() {
        return (year >= 2000) ? "Modern vehicle" : "Classic vehicle";
    }
}

