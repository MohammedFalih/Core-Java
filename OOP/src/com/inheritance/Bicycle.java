package com.inheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle( int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void applyBrakes(int decreament){
        speed -= decreament;
    }

    public void speedUp(int increament){
        speed += increament;
    }

    public String toString(){
        return ("No of gear is " + gear + "\n" + "the current speed of the bike is " + speed);
    }
}
