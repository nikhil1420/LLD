package dev.nikhil.machinecoding.parkinglot.strategy;

import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;
import dev.nikhil.machinecoding.parkinglot.models.VehicleType;

public class SimpleParkingSlotAllotmentStrategy implements ParkingPlaceAllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId) {
        // get all the floors for this parking lot which are free
        // go through the free floors and return any spot for this vehicle type
        return null;

    }
}
