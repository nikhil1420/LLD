package dev.nikhil.machinecoding.parkinglot.controllers;

import dev.nikhil.machinecoding.parkinglot.dtos.IssueTicketRequest;
import dev.nikhil.machinecoding.parkinglot.dtos.IssueTicketResponse;
import dev.nikhil.machinecoding.parkinglot.dtos.ResponseStatus;
import dev.nikhil.machinecoding.parkinglot.exception.GateNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;
import dev.nikhil.machinecoding.parkinglot.service.TicketService;

public class TicketController {

    public static String TICKET_ISSUED_MESSAGE = "Ticket issued successfully";
    public static String INVALID_GATE = "Invalid gate";
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest) {
        Ticket ticket =null;
        try {
            ticket = ticketService.issueTicket(issueTicketRequest);
        }catch (GateNotFoundException e){
            return new IssueTicketResponse(null, ResponseStatus.FAILED, INVALID_GATE);
        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUED_MESSAGE );
    }
}
