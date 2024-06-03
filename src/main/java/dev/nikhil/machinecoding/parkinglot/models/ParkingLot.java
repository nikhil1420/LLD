package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.strategy.BillingStrategy;
import dev.nikhil.machinecoding.parkinglot.strategy.ParkingPlaceAllotmentStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {

    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkinngLotStatus parkinngLotStatus;
    private ParkingPlaceAllotmentStrategy parkingPlaceAllomentStrategy;
    private BillingStrategy billingStrategy;

    public ParkingPlaceAllotmentStrategy getParkingPlaceAllomentStrategy() {
        return parkingPlaceAllomentStrategy;
    }

    public void setParkingPlaceAllomentStrategy(ParkingPlaceAllotmentStrategy parkingPlaceAllomentStrategy) {
        this.parkingPlaceAllomentStrategy = parkingPlaceAllomentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkinngLotStatus getParkinngLotStatus() {
        return parkinngLotStatus;
    }

    public void setParkinngLotStatus(ParkinngLotStatus parkinngLotStatus) {
        this.parkinngLotStatus = parkinngLotStatus;
    }
}
