package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.enums.ParkingSpotStatus;
import dev.nikhil.machinecoding.parkinglot.exception.ParkingSlotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingFloor;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;
import dev.nikhil.machinecoding.parkinglot.models.Vehicle;

import java.util.List;

public class LinearSpotAllocationStrategy implements SlotAllocationStrategy {

    @Override
    public ParkingSlot getSlotForVehicle(ParkingLot parkingLot, Vehicle vehicle) throws ParkingSlotNotFoundException {
        List<ParkingFloor> parkingFloorList = parkingLot.getParkingFloors();
        for(ParkingFloor floor : parkingFloorList) {
            for (ParkingSlot parkingSlot: floor.getParkingSlotList()){
                if(parkingSlot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)
                && parkingSlot.getVehicleType().equals(vehicle.getVehicleType())) {
                    return parkingSlot;
                }
            }
        }
        throw new ParkingSlotNotFoundException("Parking slot not found for vehicle");
    }
}
