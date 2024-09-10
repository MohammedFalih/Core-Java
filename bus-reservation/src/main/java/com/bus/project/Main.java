package com.bus.project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Bus> buses = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(121, "SRM", true, 36));
        buses.add(new Bus(344, "TransKing", true, 30));
        buses.add(new Bus(543, "TAT", false, 60));
        buses.add(new Bus(654, "Moon", false, 45));
        buses.add(new Bus(900, "Amigo", true, 1));

        String toBook = "Yes";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type 'Yes' to book and 'No' to cancel: ");
            toBook = scanner.nextLine();
            if (toBook.equalsIgnoreCase("No")) {
                break;
            } else if (toBook.equalsIgnoreCase("Yes")) {
                System.out.println("\nBus Info: ");
                buses.forEach(bus -> {
                    System.out.println(bus.getBusInfo());
                });
                Booking booking = new Booking(scanner);
                if (booking.IsAvailable(buses, bookings)) {
                    bookings.add(booking);
                    System.out.println("Booking confirmed. Happy journey");
                } else {
                    System.out.println("Oops! No seats available.");
                }
            } else {
                System.out.println("Invalid input. Please type 'Yes' or 'No'.");
            }
        }
        scanner.close();
    }
}