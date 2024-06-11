package dev.nikhil.machinecoding.parkinglot.exception;

public class ParkingLotNotFoundException extends RuntimeException {
    public ParkingLotNotFoundException(String msg) {
        super(msg);
    }
}
