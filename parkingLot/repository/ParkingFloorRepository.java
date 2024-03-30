package parkingLot.repository;

import parkingLot.exceptions.ParkingFloorNotFoundException;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository(){
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor getParkingFloor(int parkingFloorId){
        ParkingFloor floor = parkingFloorMap.get(parkingFloorId);
        if(floor == null) {
            throw new ParkingFloorNotFoundException("ParkingFloor not found for id : " + parkingFloorId);
        }
        return floor;
    }

    public void putParkingFloor(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor has been added successfully");
    }
}
