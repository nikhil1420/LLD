package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;
import dev.nikhil.machinecoding.parkinglot.models.VehicleType;

public interface ParkingPlaceAllotmentStrategy {
    ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId);
}
