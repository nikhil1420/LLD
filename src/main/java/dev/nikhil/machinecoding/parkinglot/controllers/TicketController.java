package dev.nikhil.machinecoding.parkinglot.controllers;

import dev.nikhil.machinecoding.parkinglot.exception.GateNotFoundException;
import dev.nikhil.machinecoding.parkinglot.exception.InvalidRequestException;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;
import dev.nikhil.machinecoding.parkinglot.models.Vehicle;
import dev.nikhil.machinecoding.parkinglot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) {
        if (gateId <= 0 || parkingLotId <= 0) {
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
