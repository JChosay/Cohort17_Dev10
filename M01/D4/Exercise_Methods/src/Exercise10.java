import java.util.Scanner;

public class Exercise10 {
    // 1. Add a `main` method.
    // 2. Create method that accepts a String and returns that string with all of its whitespace remove.
    // 2. Call your method in various ways in the main method.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an string with whitespaces: ");
        String input = console.nextLine();

        System.out.printf("\nYour input: %s\nWithout whitespace: %s\n", input, (removeWhiteSpace(input)));
    }

    public static String removeWhiteSpace (String input){
        return input.replaceAll("\\s+", "");
    }
}
