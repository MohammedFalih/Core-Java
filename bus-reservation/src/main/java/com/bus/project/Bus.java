package com.bus.project;

public class Bus {

    private int busNo;
    private String busName;
    private boolean acOpt;
    private int capacity;

    Bus(int busNo, String busName, boolean acOpt, int capacity) {
        this.busNo = busNo;
        this.busName = busName;
        this.acOpt = acOpt;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public String getBusName() {
        return busName;
    }

    public boolean getAcOpt(){
        return acOpt;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getBusInfo(){
        return "Bus no: " + busNo + " Bus Name: " + busName + " AC: " + acOpt + " Total Capacity: " + capacity;
    }
}
