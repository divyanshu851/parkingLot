package parkingLot.service;

import parkingLot.enums.ParkingSpotStatus;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.repository.ParkingGateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSpotRepository;
import parkingLot.repository.TicketRepository;
import parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategy;
import parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingGateRepository parkingGateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, ParkingGateRepository parkingGateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingGateRepository = parkingGateRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.putParkingSpot(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(parkingGateRepository.getParkingGate(gateId));
        return ticketRepository.putTicket(ticket);
    }

}
