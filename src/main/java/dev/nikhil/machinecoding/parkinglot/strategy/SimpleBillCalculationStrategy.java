package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.enums.BillStatus;
import dev.nikhil.machinecoding.parkinglot.models.Bill;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillingCalculationStrategy {
    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSeconds = ChronoUnit.SECONDS.between(entryTime, exitTime);
        float amount = numberOfSeconds;
        Bill bill = new Bill();
        bill.setBillAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId((long) exitTime.hashCode());
        bill.setBillStatus(BillStatus.UNPAID);
        return bill;

    }
}
