package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel {
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Float billAmount;
    private BillStatus billStatus;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(LocalDateTime exitTime, Ticket ticket, Float billAmount, BillStatus billStatus, Gate exitGate) {
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.billAmount = billAmount;
        this.billStatus = billStatus;
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Float billAmount) {
        this.billAmount = billAmount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }


}