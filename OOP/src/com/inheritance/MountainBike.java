package com.inheritance;

public class MountainBike extends Bicycle {
    int seatHeight;

    public MountainBike(int speed, int gear, int seatHeight){
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    @Override public String toString(){
        return (super.toString() + "\nThe seat height is set to " + seatHeight);
    }
}
