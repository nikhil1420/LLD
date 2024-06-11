package dev.nikhil.machinecoding.parkinglot.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private Gate entryGate;

    public Ticket() {
    }

    public Ticket(String number, LocalDateTime dateTime, Vehicle vehicle, ParkingSlot parkingSlot, Gate entryGate) {
        this.number = number;
        this.entryTime = dateTime;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryGate = entryGate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime dateTime) {
        this.entryTime = dateTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
