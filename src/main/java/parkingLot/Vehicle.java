package parkingLot;

public abstract class Vehicle {
    private vehicleType type;

    public Vehicle(vehicleType type) {
        this.type = type;
    }


    public vehicleType getType() {
        return type;
    }

    public abstract int getSize(); // Subclasses implement this method
}
