package parkingLot.repository;

import parkingLot.models.Gate;
import parkingLot.exceptions.ParkingGateNotFountException;
import java.util.HashMap;
import java.util.Map;

public class ParkingGateRepository {
    private Map<Integer, Gate> parkingGateMap;

    public ParkingGateRepository(){
        this.parkingGateMap = new HashMap<>();
    }

    public Gate getParkingGate(int gateId){
        Gate gate = parkingGateMap.get(gateId);
        if(gate == null) {
            throw new ParkingGateNotFountException("Gate not found for id : " + gateId);
        }
        return gate;
    }

    public void putParkingGate(Gate gate){
        parkingGateMap.put(gate.getId(), gate);
        System.out.println("Gate has been added successfully");
    }
}
