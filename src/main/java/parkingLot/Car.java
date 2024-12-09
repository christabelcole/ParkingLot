package parkingLot;

public class Car extends Vehicle {
    public Car() {
        super(vehicleType.CAR); // Passes CAR as the type
    }

    @Override
    public int getSize() {
        return 2; // Size of a car
    }
}
