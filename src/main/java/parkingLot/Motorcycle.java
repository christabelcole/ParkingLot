package parkingLot;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(vehicleType.MOTORCYCLE); // Passes MOTORCYCLE as the type
    }

    @Override
    public int getSize() {
        return 1; // Size of a motorcycle
    }
}
