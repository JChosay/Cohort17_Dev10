import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a palindrome: ");
        String input = console.nextLine();

        if (isPalindrome(input))
            System.out.println("Your input is a Palindrome!");
        else
            System.out.println("Your input is not a Palindrome.");
    }

    public static boolean isPalindrome(String input)
    {
        for (int i = 0; i < input.length() / 2; i++)
        {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
