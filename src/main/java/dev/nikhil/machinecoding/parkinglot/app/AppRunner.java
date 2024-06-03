package dev.nikhil.machinecoding.parkinglot.app;

import dev.nikhil.machinecoding.parkinglot.controllers.TicketController;
import dev.nikhil.machinecoding.parkinglot.repositories.GateRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.ParkingLotRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.TicketRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.VehicleRepository;
import dev.nikhil.machinecoding.parkinglot.service.TicketService;

public class AppRunner {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

       // ticketController.issueTicket()
    }
}
