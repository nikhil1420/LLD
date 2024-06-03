package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.ParkingLotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    Map<Long, ParkingLot> parkingLots = new HashMap<Long, ParkingLot>();
    public ParkingLot getParkingLotById(Long parkingLotId) {
        if(parkingLots.containsKey(parkingLotId)){
            return parkingLots.get(parkingLotId);
        }
        throw new ParkingLotNotFoundException();
    }
}
