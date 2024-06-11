package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.GateStatus;
import dev.nikhil.machinecoding.parkinglot.enums.GateType;

public class Gate extends BaseModel{
    private int gateNumber; //101 Floor 1 gate no. 01
    private GateType gateType;
    private String operator;
    private GateStatus gateStatus;

    public Gate() {
    }

    public Gate(int gateNumber, GateType gateType, String operator, GateStatus gateStatus) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
