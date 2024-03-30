package parkingLot;

import parkingLot.controller.InitController;
import parkingLot.controller.TicketController;
import parkingLot.enums.VehicleType;
import parkingLot.models.Bill;
import parkingLot.models.ParkingLot;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.repository.*;
import parkingLot.service.InitialisationService;
import parkingLot.service.TicketService;

import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    ParkingGateRepository parkingGateRepository = new ParkingGateRepository();
    TicketRepository ticketRepository =  new TicketRepository();

    InitialisationService initialisationService = new InitialisationService(
            parkingGateRepository,
            parkingFloorRepository,
            parkingLotRepository,
            parkingSpotRepository
    );

    TicketService ticketService = new TicketService(
            ticketRepository,
            parkingLotRepository,
            parkingSpotRepository,
            parkingGateRepository
    );

        TicketController ticketController = new TicketController(ticketService);
        InitController initController = new InitController(initialisationService);
        System.out.println("**** Parking lot data initialisation - start");
        ParkingLot parkingLot = initController.init();
        System.out.println("**** Parking lot data initialisation - end");

        System.out.println("Please enter the option -> 1. Enter Parking Lot, 2. Exit Parking Lot");
        int option = sc.nextInt();

        while(true){

        if(option == 1){
            Vehicle vehicle = new Vehicle();
            System.out.println("Welcome to out parking lot");
            System.out.println("Please enter the vehicle details");
            System.out.println("Please enter the vehicle number");
            String number = sc.next();
            vehicle.setVehicleNumber(number);
            System.out.println("Please enter the vehicle color");
            String color = sc.next();
            vehicle.setColor(color);
            System.out.println("Please choice the vehicle type -> 1. Car  2. Bike");
            int vehicleType = sc.nextInt();
            if(vehicleType==1){
                vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
            }else{
                vehicle.setVehicleType(VehicleType.TWO_WHEELER);
            }
            System.out.println("Please enter the parkingLot ID");
            int parkingLotId = sc.nextInt();
            System.out.println("Please enter the gate ID");
            int gateId = sc.nextInt();
            Ticket ticket = ticketController.generateTicket(vehicle, gateId, parkingLotId);
            System.out.println("Ticket details : " + ticket);
        }else if(option == 2){

        }else {
            System.out.println("Thanks");
            break;
        }

        }

    }


}
