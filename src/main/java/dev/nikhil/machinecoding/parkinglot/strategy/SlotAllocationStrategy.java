package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.exception.ParkingSlotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;
import dev.nikhil.machinecoding.parkinglot.models.Vehicle;

public interface SlotAllocationStrategy {

    ParkingSlot getSlotForVehicle(ParkingLot parkingLot, Vehicle vehicle) throws ParkingSlotNotFoundException;
}
