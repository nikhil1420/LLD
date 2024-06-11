package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.ParkingFloorNotFoundException;
import dev.nikhil.machinecoding.parkinglot.exception.ParkingLotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingFloor;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    Map<Long, ParkingFloor> ParkingFloorMap;
    Long prevParkingFloorId = 0l;
    public ParkingFloorRepository() {
        this.ParkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(long ParkingFloorId) throws ParkingFloorNotFoundException {
        ParkingFloor ParkingFloor = ParkingFloorMap.get(ParkingFloorId);
        if (ParkingFloor == null) {
            throw new ParkingFloorNotFoundException("Parking Floor Not Found for Id "+ ParkingFloor);
        }
        return ParkingFloor;
    }

    public void put(ParkingFloor parkingFloor) {
        prevParkingFloorId++;
        parkingFloor.setId(prevParkingFloorId);
        ParkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking floor has been added successfully");
    }
}
