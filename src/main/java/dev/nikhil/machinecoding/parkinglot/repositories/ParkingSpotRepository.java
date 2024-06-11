package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.ParkingSlotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Long, ParkingSlot> parkingSlotMap; // table

    public ParkingSpotRepository() {
        this.parkingSlotMap = new HashMap<>();
    }

    public ParkingSlot get(long parkingSlotId) throws ParkingSlotNotFoundException {
        ParkingSlot parkingSpot = parkingSlotMap.get(parkingSlotId);
        if(parkingSpot == null){
            throw new ParkingSlotNotFoundException("ParkingSpot not found for id : " + parkingSlotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSlot parkingSlot){
        parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
        System.out.println("ParkingSpot has been added successfully");
    }
}
