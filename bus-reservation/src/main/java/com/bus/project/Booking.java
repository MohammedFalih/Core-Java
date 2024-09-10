package com.bus.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date journeyDate;
    String pickup_point;
    String drop_point;

    Booking(Scanner scanner) throws ParseException{
        System.out.println("Enter passenger name: ");
        passengerName = scanner.nextLine();
        System.out.println("Choose pickup point: ");
        pickup_point = scanner.nextLine();
        System.out.println("Choose Drop point: ");
        drop_point = scanner.nextLine();
        System.out.println("Enter journey date: 'dd-mm-yyyy'");
        String dateInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        journeyDate = dateFormat.parse(dateInput);
        System.out.println("Enter bus number to choose: ");
        busNo = scanner.nextInt();
        scanner.nextLine();
    }

    public boolean IsAvailable(List<Bus> buses, List<Booking> bookings){
        int capacity = 0;
        for(Bus bus:buses){
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for(Booking b:bookings){
            if (b.busNo == busNo && b.journeyDate.equals(journeyDate)) {
                booked++;
            }
        }
         
        return booked<capacity ? true : false;
    }
}
