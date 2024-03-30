package parkingLot.controller;

import parkingLot.models.ParkingLot;
import parkingLot.service.InitialisationService;

public class InitController {
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
        return initialisationService.init();
    }
}
