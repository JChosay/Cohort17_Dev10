// Reverse Engineered Brian Hacker's Program
import java.util.Scanner;
public class ObjectiveProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean incorrectAnswer = true;
        System.out.printf("What weighs almost nothing, yet no man can hold it for more than 5 minutes?\nEnter [1] to give up.\nYour answer: ");
        do {
            String input = console.nextLine();
            if (input.equals("1")){
                System.out.println("The answer is your breath! Nice try.");
                incorrectAnswer = false;
            }else if (input.equalsIgnoreCase("breath")) {
                System.out.println("Congratulations! You are correct.");
                incorrectAnswer = false;
            }
            else
                System.out.printf("Incorrect!\nEnter [1] to give up.\nPlease Try again: ");
        } while (incorrectAnswer);
    }
}
