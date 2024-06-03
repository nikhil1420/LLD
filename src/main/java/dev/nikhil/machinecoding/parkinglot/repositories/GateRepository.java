package dev.nikhil.machinecoding.parkinglot.repositories;

import dev.nikhil.machinecoding.parkinglot.exception.GateNotFoundException;
import dev.nikhil.machinecoding.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GateRepository {

    Map<Long, Gate> gates = new HashMap<Long, Gate>();

    public Gate findGateById(long id) throws GateNotFoundException{
        if (gates.containsKey(id)) {
        return gates.get(id);
        }
        throw new GateNotFoundException();
    }
}
