package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.ParkingLotNotFoundException;
import dev.nikhil.machinecoding.parkinglot.exception.TicketNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.ParkingLot;
import dev.nikhil.machinecoding.parkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    Map<Long, ParkingLot> parkingLotMap;
    Long prevParkingLotId = 0l;
    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(long parkingLotId) {
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if (parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking Lot Not Found for Id "+ parkingLot);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot) {
        prevParkingLotId++;
        parkingLot.setId(prevParkingLotId);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added successfully");
    }
}
