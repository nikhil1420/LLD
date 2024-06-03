package dev.nikhil.machinecoding.parkinglot.service;

import dev.nikhil.machinecoding.parkinglot.dtos.IssueTicketRequest;
import dev.nikhil.machinecoding.parkinglot.models.*;
import dev.nikhil.machinecoding.parkinglot.repositories.GateRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.ParkingLotRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.TicketRepository;
import dev.nikhil.machinecoding.parkinglot.repositories.VehicleRepository;
import dev.nikhil.machinecoding.parkinglot.strategy.ParkingPlaceAllotmentStrategy;
import dev.nikhil.machinecoding.parkinglot.strategy.ParkingSlotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(IssueTicketRequest issueTicketRequest) {
        Ticket ticket = new Ticket();
        ticket.setDateTime(new Date());

        //get gate details
        Gate gate = gateRepository.findGateById(issueTicketRequest.getGateId());
        ticket.setEntryGate(gate);

        Vehicle vehicle = vehicleRepository.getVehicleById(issueTicketRequest.getVehicleNumber());
        if(vehicle == null) {
           vehicle = new Vehicle(issueTicketRequest.getVehicleType() , issueTicketRequest.getVehicleNumber(),
                    issueTicketRequest.getOwnerName());
           vehicleRepository.save(vehicle);
        }

        ticket.setVehicle(vehicle);

        //get ParkingLot
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(issueTicketRequest.getParkingLotId());
        ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy = parkingLot.getParkingPlaceAllomentStrategy();
        ParkingPlaceAllotmentStrategy parkingSlotAllotmentRule =
                ParkingSlotAllotmentStrategyFactory.getParkingSlotAllotmentStrategyForType(parkingPlaceAllotmentStrategy);
         ParkingSlot parkingSlot = parkingSlotAllotmentRule.getParkingSlot(issueTicketRequest.getVehicleType(), issueTicketRequest.getParkingLotId());
        ticket.setParkingSlot(parkingSlot);

        // Ticket Number
        ticket.setNumber(issueTicketRequest.getOwnerName() + UUID.randomUUID());
        ticketRepository.save(ticket);

        return ticket;
    }
}
