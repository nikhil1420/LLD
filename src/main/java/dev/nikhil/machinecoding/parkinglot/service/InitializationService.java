package dev.nikhil.machinecoding.parkinglot.service;

import dev.nikhil.machinecoding.parkinglot.enums.*;
import dev.nikhil.machinecoding.parkinglot.models.*;
import dev.nikhil.machinecoding.parkinglot.repositories.*;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {

    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
    GateRepository gateRepository = new GateRepository();

    public InitializationService(ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        System.out.println("Initializing parking lot Initialization");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Bangalore Parking Lot");
        parkingLot.setAddress("Bangalore");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId((long) i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            List<ParkingSlot> parkingSlots = new ArrayList<>();
            for(int j=1;j<=10;j++) {
                ParkingSlot parkingSlot = new ParkingSlot();
                parkingSlot.setId((long) j);
                parkingSlot.setNumber((i*100) + j);
                parkingSlot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSlot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSlots.add(parkingSlot);
                parkingSpotRepository.put(parkingSlot);
            }
            parkingFloor.setParkingSlotList(parkingSlots);

            Gate entryGate = new Gate();
            entryGate.setId((long) (i+1000)+1);
            entryGate.setGateNumber((i*100)+1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator("Operator :" +i+1);

            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);
            Gate exitGate = new Gate();
            exitGate.setId((long) (i*2000)+2);
            exitGate.setGateNumber((i*100)+2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperator("Operator :" +i+2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);
            parkingFloors.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);


    }
}
