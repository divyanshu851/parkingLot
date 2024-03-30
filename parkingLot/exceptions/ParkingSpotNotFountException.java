package parkingLot.exceptions;

public class ParkingSpotNotFountException extends RuntimeException{
    public ParkingSpotNotFountException() {
    }

    public ParkingSpotNotFountException(String message) {
        super(message);
    }
}
