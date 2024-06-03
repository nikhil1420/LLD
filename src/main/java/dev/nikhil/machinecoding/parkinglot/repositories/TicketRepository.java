package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long, Ticket> tickets = new HashMap<Long, Ticket>();
    Long prevTicketId = 0l;
    public Ticket save(Ticket ticket) {
        prevTicketId++;
        ticket.setId(prevTicketId);
        tickets.putIfAbsent(prevTicketId, ticket);
        return ticket;
    }
}
