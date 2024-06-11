package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.ParkingLotStatus;
import dev.nikhil.machinecoding.parkinglot.enums.VehicleType;
import dev.nikhil.machinecoding.parkinglot.strategy.BillingCalculationStrategy;
import dev.nikhil.machinecoding.parkinglot.strategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {

    private String name;
    private String address;
    private int capacity;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> vehicleTypesSupported;
    private ParkingLotStatus parkingLotStatus;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillingCalculationStrategy billingCalculationStrategy;

    public ParkingLot() {
    }

    public ParkingLot(String name, String address, int capacity, List<ParkingFloor> parkingFloors, List<VehicleType> vehicleTypesSupported, ParkingLotStatus parkingLotStatus, SlotAllocationStrategy slotAllocationStrategy, BillingCalculationStrategy billingCalculationStrategy) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.parkingFloors = parkingFloors;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.parkingLotStatus = parkingLotStatus;
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.billingCalculationStrategy = billingCalculationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public BillingCalculationStrategy getBillingCalculationStrategy() {
        return billingCalculationStrategy;
    }

    public void setBillingCalculationStrategy(BillingCalculationStrategy billingCalculationStrategy) {
        this.billingCalculationStrategy = billingCalculationStrategy;
    }
}
