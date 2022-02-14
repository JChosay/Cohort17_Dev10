package classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {
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
}
