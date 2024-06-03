package dev.nikhil.machinecoding.parkinglot.strategy;

public class ParkingSlotAllotmentStrategyFactory {

    public static ParkingPlaceAllotmentStrategy getParkingSlotAllotmentStrategyForType(ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy){
        return new SimpleParkingSlotAllotmentStrategy();
    }
}
