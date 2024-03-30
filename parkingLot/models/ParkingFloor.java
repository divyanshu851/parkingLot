package parkingLot.models;

import parkingLot.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private Gate entryGate;
    private Gate exitGate;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor(){

    }

    public ParkingFloor(List<ParkingSpot> parkingSpots, int floorNumber, Gate entryGate, Gate exitGate, ParkingFloorStatus parkingFloorStatus) {
        this.parkingSpots = parkingSpots;
        this.floorNumber = floorNumber;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
