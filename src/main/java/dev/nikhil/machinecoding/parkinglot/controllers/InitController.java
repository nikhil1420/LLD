package dev.nikhil.machinecoding.parkinglot.controllers;

import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.service.InitializationService;

public class InitController {
    private InitializationService initialisationService;

    public InitController(InitializationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
         return initialisationService.init();
    }
}
