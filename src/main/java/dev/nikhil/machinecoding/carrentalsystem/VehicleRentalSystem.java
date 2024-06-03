package dev.nikhil.machinecoding.carrentalsystem;

import dev.nikhil.machinecoding.carrentalsystem.models.Location;
import dev.nikhil.machinecoding.carrentalsystem.models.Store;
import dev.nikhil.machinecoding.carrentalsystem.models.User;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location) {

        //based on location we will filter out store from store List

        return storeList.get(0);
    }
}
