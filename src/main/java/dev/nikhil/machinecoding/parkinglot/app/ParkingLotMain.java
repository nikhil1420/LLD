package dev.nikhil.machinecoding.parkinglot.app;

import dev.nikhil.machinecoding.parkinglot.controllers.InitController;
import dev.nikhil.machinecoding.parkinglot.controllers.TicketController;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.repositories.*;
import dev.nikhil.machinecoding.parkinglot.service.InitializationService;
import dev.nikhil.machinecoding.parkinglot.service.TicketService;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitializationService initializationService = new InitializationService(
                parkingLotRepository,
                parkingSpotRepository,
                parkingFloorRepository,
                gateRepository
        );

        InitController initController = new InitController(initializationService);
        ParkingLot parkingLot = initController.init();
        System.out.println("END");

    }
}
