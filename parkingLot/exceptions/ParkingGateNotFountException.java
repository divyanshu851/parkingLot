package parkingLot.exceptions;

public class ParkingGateNotFountException extends RuntimeException{
    public ParkingGateNotFountException() {
    }

    public ParkingGateNotFountException(String message) {
        super(message);
    }
}
