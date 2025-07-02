package csc350;

public class AutomobileImproved {
    // Private variables with validation constraints
    private String make;
    private String model;
    private String color;
    private int year;
    private boolean isRemoved;

    // Constructor with validation
    public AutomobileImproved(String make, String model, String color, int year) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        this.isRemoved = false;
    }

    // Validation helpers
    private boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    private boolean isValidYear(int year) {
        return year >= 1886 && year <= 2100; 
    }

    // Field update methods with validation
    public String updateMake(String newMake) {
        if (isRemoved) return "Error: Cannot update removed vehicle";
        setMake(newMake);
        return "Make updated to " + newMake;
    }

    public String updateModel(String newModel) {
        if (isRemoved) return "Error: Cannot update removed vehicle";
        setModel(newModel);
        return "Model updated to " + newModel;
    }

    public String updateColor(String newColor) {
        if (isRemoved) return "Error: Cannot update removed vehicle";
        setColor(newColor);
        return "Color updated to " + newColor;
    }

    public String updateYear(int newYear) {
        if (isRemoved) return "Error: Cannot update removed vehicle";
        setYear(newYear);
        return "Year updated to " + newYear;
    }

    // Field setters with validation
    private void setMake(String make) {
        if (!isValidString(make)) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }
        this.make = make.trim();
    }

    private void setModel(String model) {
        if (!isValidString(model)) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model.trim();
    }

    private void setColor(String color) {
        if (!isValidString(color)) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color.trim();
    }

    private void setYear(int year) {
        if (!isValidYear(year)) {
            throw new IllegalArgumentException("Year must be between 1886-2100");
        }
        this.year = year;
    }

    // Vehicle removal with validation
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (isRemoved) return "Error: Vehicle already removed";
        
        if (autoMake != null && autoModel != null && autoColor != null &&
            autoMake.equals(make) && 
            autoModel.equals(model) && 
            autoColor.equals(color) && 
            autoYear == year) {
            
            isRemoved = true;
            return "Vehicle removed successfully";
        }
        return "Error: Vehicle details mismatch";
    }

    // Information display
    public String displayInfo() {
        return isRemoved 
            ? "No vehicle data available" 
            : String.format("%d %s %s (%s)", year, make, model, color);
    }

    // Year classification
    public String checkYear() {
        if (isRemoved) return "No vehicle data available";
        return (year >= 2000) ? "Modern vehicle" : "Classic vehicle";
    }
}