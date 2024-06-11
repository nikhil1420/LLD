package dev.nikhil.machinecoding.parkinglot.service;

import dev.nikhil.machinecoding.parkinglot.enums.ParkingSpotStatus;
import dev.nikhil.machinecoding.parkinglot.exception.ParkingSlotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;
import dev.nikhil.machinecoding.parkinglot.models.Vehicle;
import dev.nikhil.machinecoding.parkinglot.repositories.*;
import dev.nikhil.machinecoding.parkinglot.strategy.SlotAllocationStrategy;
import dev.nikhil.machinecoding.parkinglot.strategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) throws ParkingSlotNotFoundException {
        SlotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);

        ParkingSlot allocatedSpot = strategy.getSlotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
