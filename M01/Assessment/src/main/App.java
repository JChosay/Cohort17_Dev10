package main;

import classes.Hotel;
import classes.CustomScanner;

public class App {
    private static String[] capsuleBooking;
    static CustomScanner scan = new CustomScanner();

    // Set the capacity of the hotel
    public static Hotel initializeHotel() {
        String prompt = "Welcome to Capsule Hotel\n========================\nEnter the number of capsules available: ";
        int capacity = scan.getIntegerInput(prompt);
        prompt = "Enter the name of the hotel: ";
        String name = scan.getStringInput(prompt);
        return new Hotel(name, capacity);
    }

    public static void main(String[] args) {
        Hotel hotel = initializeHotel();
        boolean exitProgram = false;
        do{
            exitProgram = hotel.mainMenu();
        } while (!exitProgram);
    }
}