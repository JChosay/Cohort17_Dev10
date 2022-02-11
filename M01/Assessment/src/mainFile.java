import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainFile {
    private static String[] capsuleBooking;

    // Get string input from user and check that the input is not empty/blank
    public static String getStringInput(String prompt){
        Scanner console = new Scanner(System.in);
        String input;
        do {
            System.out.print(prompt);
            input = console.nextLine();
        } while (input.isBlank());
        return input;
    }

    // Get integer input from user
    public static int getIntegerInput(String prompt){
        Scanner console = new Scanner(System.in);
        int input = 0;
        do {
            // Try catch to make sure that the user can only enter positive numbers.
            try {
                System.out.print(prompt);
                input = console.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid Input. Try again.\n");
                console.nextLine();
            }
        } while (input <= 0);
        return input;
    }

    // Ask if user wants to exit program and confirm their decision
    public static boolean confirmExit(){
        if (getStringInput("\nExit Menu\n=========\n" +
                "Are you sure you want to exit?\nAll data will be lost.\n" +
                "Exit [y / n]: ").equalsIgnoreCase("y")) {
            System.out.println("Exiting...\nGoodbye.");
            return true;
        }
        else
            return false;
    }

    // Set the capacity of the hotel
    public static int initializeHotelCapacity (){
        String prompt = "Welcome to Capsule Hotel\n========================\nEnter the number of capsules available: ";
        return getIntegerInput(prompt);
    }

    // Set a string input for the name of the guest and get an integer for a desired open room to book a guest to.
    public static void checkIn(){
        // Check if there is any empty room.
        if (Arrays.asList(capsuleBooking).contains(null)) {
            boolean checkingIn = true;
            String inputName = getStringInput("\nCheck In Menu\n=============\nGuest Name: ");
            int inputRoom;

            do {
                System.out.printf("Capsule #[1 - %d]", capsuleBooking.length);
                inputRoom = getIntegerInput(": ");

                // Check if the input for room is a valid input/in range.
                if (inputRoom >= 1 && inputRoom <= capsuleBooking.length) {
                    // Check if the room is available or occupied.
                    if (capsuleBooking[inputRoom - 1] == null) {
                        capsuleBooking[inputRoom - 1] = inputName;
                        System.out.printf("%s is now checked into room %d!\n", inputName, inputRoom);
                        checkingIn = false;
                    } else {
                        System.out.println("Sorry!\nThat room is occupied. Try again!\n");
                    }
                }
                else
                    System.out.println("Invalid input! Try again.\n");
            } while (checkingIn);
        } else
            System.out.println("Sorry!\nThe hotel is full so there are no available rooms.\n");
    }

    // Get an integer input of the guest's room that is checking out.
    public static void checkOut(){
        // Check if there is a room occupied.
        boolean occupiedCapsule = false;
        for (String s : capsuleBooking) {
            if (s != null) {
                occupiedCapsule = true;
                break;
            }
        }
        if (occupiedCapsule) {
            boolean checkingOut = true;
            System.out.println("\nCheck Out Menu\n==============");
            int inputRoom;

            // Get integer of guest's room number to check out.
            do {
                System.out.printf("Capsule #[1 - %d]", capsuleBooking.length);
                inputRoom = getIntegerInput(": ");

                // Check if the input for room is a valid input/in range.
                if (inputRoom >= 1 && inputRoom <= capsuleBooking.length) {
                    // Check if the room is available or occupied.
                    if (capsuleBooking[inputRoom - 1] != null) {
                        capsuleBooking[inputRoom - 1] = null;
                        System.out.printf("Room %d is now empty!\n", inputRoom);
                        checkingOut = false;
                    } else {
                        System.out.println("Sorry!\nThat room is already empty. Try again!\n");
                    }
                }
                else
                    System.out.println("Invalid input! Try again.\n");
            } while (checkingOut);
        } else
            System.out.println("Sorry!\nThe hotel is empty so there are no occupied rooms to check out.");
    }

    // View the name of guests adjacent in 5 rooms before and after to input room number.
    public static void viewGuests(){
        boolean gettingRoomNum = true;
        System.out.println("\nView Guests Menu\n================");
        int inputRoom, start, end;

        // Get integer of room number to view around.
        do {
            System.out.printf("Capsule #[1 - %d]", capsuleBooking.length);
            inputRoom = getIntegerInput(": ");

            // Check if the input for room is a valid input/in range.
            if (inputRoom >= 1 && inputRoom <= capsuleBooking.length) {
                // IF room number is 6 or lower than start at 0, ELSE IF room number is 5 from end then start 10 from end, ELSE start 6 from room number.
                start = (inputRoom <= 6) ? 0 : (inputRoom >= (capsuleBooking.length - 5)) ? (capsuleBooking.length - 10) : (inputRoom - 6);

                // IF room number is less than 6 then end at 10, ELSE IF room number is 5 from end then end at end, ELSE end 5 after room number.
                end = (inputRoom < 6) ? 10 : (inputRoom >= (capsuleBooking.length - 5)) ? capsuleBooking.length : (inputRoom + 5);

                // Print the room and guest name
                for (int i = start; i < end; i++)
                    System.out.printf("%d: %s\n", (i + 1), capsuleBooking[i]);
                gettingRoomNum = false;
            }
            else
                System.out.println("Invalid input! Try again.\n");
        } while (gettingRoomNum);
    }

    public static boolean mainMenu(){
        int input = getIntegerInput("\nMain Menu\n=========\n" +
                "1. Check In\n2. Check Out\n3. View Guests\n4. Exit\n" +
                "Choose on option [1 - 4]: ");
        switch (input) {
            case 1:
                checkIn();
                return false;
            case 2:
                checkOut();
                return false;
            case 3:
                viewGuests();
                return false;
            case 4:
                return confirmExit();
            default:
                System.out.println("Invalid input! Please try again.");
                return false;
        }
    }

    public static void main(String[] args) {
        int hotelCapacity = initializeHotelCapacity();
        capsuleBooking = new String[hotelCapacity];
        boolean exitProgram;
        do{
            exitProgram = mainMenu();
        } while (!exitProgram);
    }
}