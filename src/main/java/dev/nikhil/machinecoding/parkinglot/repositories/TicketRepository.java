package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.TicketNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long, Ticket> tickets;
    Long prevTicketId = 0l;
    public TicketRepository() {
        this.tickets = new HashMap<>();
    }

    public Ticket get(long ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if (ticket == null) {
            throw new TicketNotFoundException("Ticket Not Found for Id "+ ticketId);
        }
        return ticket;
    }

    public Ticket put(Ticket ticket) {
        prevTicketId++;
        ticket.setId(prevTicketId);
        tickets.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
        return ticket;
    }
}
