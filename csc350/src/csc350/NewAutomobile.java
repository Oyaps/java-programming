package csc350;

public class NewAutomobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default Constructor
    public NewAutomobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized Constructor
    public NewAutomobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add/Update vehicle method
    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added/updated successfully.";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }

    // List vehicle information as String array
    public String[] listVehicleInformation() {
        String[] info = new String[5];
        try {
            info[0] = "Make: " + make;
            info[1] = "Model: " + model;
            info[2] = "Color: " + color;
            info[3] = "Year: " + year;
            info[4] = "Mileage: " + mileage;
        } catch (Exception e) {
            info[0] = "Error retrieving vehicle info";
        }
        return info;
    }

    // Remove vehicle (reset attributes)
    public String removeVehicle() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    // Update individual attributes
    public String updateVehicleAttributes(String make, String model, String color, String year, String mileage) {
        try {
            if (!make.isEmpty()) this.make = make;
            if (!model.isEmpty()) this.model = model;
            if (!color.isEmpty()) this.color = color;
            if (!year.isEmpty()) this.year = Integer.parseInt(year);
            if (!mileage.isEmpty()) this.mileage = Integer.parseInt(mileage);
            return "Vehicle updated successfully.";
        } catch (NumberFormatException e) {
            return "Invalid number format: " + e.getMessage();
        } catch (Exception e) {
            return "Update error: " + e.getMessage();
        }
    }
}

