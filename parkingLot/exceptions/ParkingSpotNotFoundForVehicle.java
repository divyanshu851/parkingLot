package parkingLot.exceptions;

public class ParkingSpotNotFoundForVehicle extends RuntimeException{
    public ParkingSpotNotFoundForVehicle() {
    }

    public ParkingSpotNotFoundForVehicle(String message) {
        super(message);
    }
}
