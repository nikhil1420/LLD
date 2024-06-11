package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.models.Bill;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;

public interface BillingCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
