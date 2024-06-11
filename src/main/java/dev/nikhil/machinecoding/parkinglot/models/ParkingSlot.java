package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.ParkingLotStatus;
import dev.nikhil.machinecoding.parkinglot.enums.ParkingSpotStatus;
import dev.nikhil.machinecoding.parkinglot.enums.VehicleType;

public class ParkingSlot extends BaseModel {
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private int number;
    //private ParkingFloor floor;
    private Vehicle vehicle;

    public ParkingSlot(VehicleType vehicleType, ParkingLotStatus parkingLotStatus, int number, Vehicle vehicle) {
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.number = number;
        this.vehicle = vehicle;
    }

    public ParkingSlot(){

    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
