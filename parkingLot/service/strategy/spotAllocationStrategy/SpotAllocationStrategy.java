package parkingLot.service.strategy.spotAllocationStrategy;

import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.Vehicle;

public interface SpotAllocationStrategy {

    ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);
}
