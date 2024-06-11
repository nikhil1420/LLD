package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNumber;
    private List<ParkingSlot> parkingSlotList;
    private Gate entryGate;
    private Gate exitGate;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNumber, List<ParkingSlot> parkingSlotList, Gate entryGate, Gate exitGate, ParkingFloorStatus parkingFloorStatus) {
        this.floorNumber = floorNumber;
        this.parkingSlotList = parkingSlotList;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
