package parkingLot.repository;

import parkingLot.exceptions.ParkingSpotNotFountException;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot getParkingSpot(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFountException("ParkingSpot not found with id + " + parkingSpotId);

        }
        return parkingSpot;
    }

    public void putParkingSpot(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been added successfully");
    }
}
