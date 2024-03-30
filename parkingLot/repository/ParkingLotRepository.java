package parkingLot.repository;

import parkingLot.exceptions.ParkingLotNotFoundException;
import parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
   private Map<Integer, ParkingLot> parkingLotMap;
   private static int idCounter = 0;
    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot getParkingLot(int parkingLotId){
        ParkingLot parkingLot =  parkingLotMap.get(parkingLotId);
        if(parkingLot==null){
            throw new ParkingLotNotFoundException("ParkingLot not found with id : " + parkingLotId);
        }
        return parkingLot;
    }

    public void putParkingLot(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added successfully");

    }
}
