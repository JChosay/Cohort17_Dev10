// My Program
import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter a palindrome: ");
        String input = console.nextLine();

        if (isPalindrome(input))
            System.out.println("Your input is a Palindrome!");
        else
            System.out.println("Your input is not a Palindrome.");
    }

    public static boolean isPalindrome(String input)
    {
        boolean result = true;
        for (int i = 0; i < input.length() / 2; i++)
        {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
