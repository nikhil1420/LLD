package dev.nikhil.machinecoding.parkinglot.exception;

public class TicketNotFoundException extends RuntimeException {

    public TicketNotFoundException(String s) {
        super(s);
    }
}
