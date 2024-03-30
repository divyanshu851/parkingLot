package parkingLot.service.strategy.spotAllocationStrategy;

import parkingLot.enums.ParkingSpotStatus;
import parkingLot.enums.VehicleType;
import parkingLot.exceptions.ParkingSpotNotFoundForVehicle;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.Vehicle;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{

    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {

        List<ParkingFloor> floors = parkingLot.getFloors();
        for(ParkingFloor floor : floors){
            List<ParkingSpot> spots = floor.getParkingSpots();
            for(ParkingSpot spot : spots){
                if(spot.getSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                spot.getVehicleType().equals(vehicle.getVehicleType())){
                    return spot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicle("Please go home and sleep");
    }
}
