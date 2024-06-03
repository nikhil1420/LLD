package dev.nikhil.machinecoding.parkinglot.models;

public class Operator extends BaseModel{
    int empId;
    String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
