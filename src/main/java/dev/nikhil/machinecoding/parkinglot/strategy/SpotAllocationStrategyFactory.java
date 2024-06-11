package dev.nikhil.machinecoding.parkinglot.strategy;

public class SpotAllocationStrategyFactory {

    public static SlotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
