package parkingLot.models;

import parkingLot.enums.ParkingSpotStatus;
import parkingLot.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private ParkingSpotStatus spotStatus;
    private Vehicle vehicle;

    public ParkingSpot(int number, VehicleType vehicleType, ParkingSpotStatus spotStatus, Vehicle vehicle) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.spotStatus = spotStatus;
        this.vehicle = vehicle;
    }

    public ParkingSpot() {

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(ParkingSpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
