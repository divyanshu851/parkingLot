package parkingLot.service;

import parkingLot.enums.*;
import parkingLot.models.Gate;
import parkingLot.models.ParkingFloor;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.repository.ParkingFloorRepository;
import parkingLot.repository.ParkingGateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private ParkingGateRepository gateRepository;
    private ParkingFloorRepository floorRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitialisationService(ParkingGateRepository gateRepository, ParkingFloorRepository floorRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.floorRepository = floorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("****** Starting Initialisation ******");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Radhe Parking Center");
        parkingLot.setAddress("Somewhere in the costly mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));

        List<ParkingFloor> floors = new ArrayList<>();
        for(int i=1; i<=10; i++){
            ParkingFloor floor = new ParkingFloor();
            floor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            floor.setFloorNumber(i);
            floor.setId(i);
            List<ParkingSpot> spots = new ArrayList<>();
            for(int j=1; j<=10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i*100) + j);
                parkingSpot.setSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.putParkingSpot(parkingSpot);
            }
            floor.setParkingSpots(spots);
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : "+ i + 1);
            floor.setEntryGate(entryGate);
            gateRepository.putParkingGate(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : "+ i + 2);
            floor.setExitGate(exitGate);
            gateRepository.putParkingGate(exitGate);

            floors.add(floor);
            floorRepository.putParkingFloor(floor);
        }
        parkingLot.setFloors(floors);
        parkingLotRepository.putParkingLot(parkingLot);
        return parkingLotRepository.getParkingLot(1);
    }
}