import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        // INTERLEAVE
        Scanner console = new Scanner(System.in);

        System.out.print("First string: ");
        String first = console.nextLine();

        System.out.print("Second string: ");
        String second = console.nextLine();

        // 1. Write a loop to interleave two strings to form a new string.
        // To interleave, during each loop take one character from the first string and add it to the result
        // and take one character from the second string and add it to the result.
        // If there are no more characters available, don't add characters.
        // 2. Print the result.
        int shortest;
        if (first.length() < second.length())
            shortest = first.length();
        else
            shortest = second.length();

        String result = "";
        for (int i = 0; i < shortest; i++) {
            result = result + first.charAt(i) + second.charAt(i);
            if (i + 1 == shortest) {
                if (shortest == first.length())
                    result = result + second.substring(i + 1);
                else
                    result = result + first.substring(i + 1);
            }
        }
        System.out.println(result);

        // Examples
        // "abc", "123" -> "a1b2c3"
        // "cat", "dog" -> "cdaotg"
        // "wonder", "o" -> "woonder"
        // "B", "igstar" -> "Bigstar"
        // "", "huh?" -> "huh?"
        // "wha?", "" -> "wha?"
    }
}
