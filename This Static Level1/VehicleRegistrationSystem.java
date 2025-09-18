package Level1this;

class Vehicle {
    private static double registrationFee = 1500.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid object. Not a Vehicle.");
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG101");
        Vehicle v2 = new Vehicle("Bob", "Bike", "REG102");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000.0);
        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

