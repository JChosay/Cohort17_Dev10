import java.util.Scanner;

public class Exercise14 {
    /* SHORT SURVEY

    Write a program that asks a user four questions and prints the results:
    - What is your first name?
    - What is your last name?
    - How many towns/cities have you lived in?
    - How many musical instruments can you play?

    Store each answer in a variable with an appropriate type.
    Print the results after the user has answered all four questions.

    Use methods to break the program into reusable blocks of code.
     */
    public static String getStringInput(String prompt){
        Scanner console = new Scanner(System.in);
        String input;
        do {
            System.out.print(prompt);
            input = console.nextLine();
        } while (input.isBlank());
        return input;
    }

    public static int getIntegerInput(String prompt){
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        return console.nextInt();
    }

    public static void main(String[] args) {
        String firstName, lastName;
        int numOfCities, numOfInstruments;
        firstName = getStringInput("Enter your first name: ");
        lastName = getStringInput("Enter your last name: ");
        numOfCities = getIntegerInput("Enter the number of towns/cities have you lived in: ");
        numOfInstruments = getIntegerInput("Enter the number of musical instruments you can play: ");

        System.out.printf("Your name is %s %s. You have lived in %d towns/cities and can play %d musical instrument(s).",
                firstName, lastName, numOfCities, numOfInstruments);
    }
}
