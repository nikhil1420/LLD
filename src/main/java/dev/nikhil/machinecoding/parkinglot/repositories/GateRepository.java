package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.GateNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Long, Gate> gateMap; // table

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(long gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for id : " + gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(), gate);
        System.out.println("gate has been added successfully");
    }
}
