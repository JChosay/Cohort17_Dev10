import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        // DOUBLE IT
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String phrase = console.nextLine();

        // 1. Write a loop that "doubles" each character in a user-entered word.
        // You'll need a new string variable to store the result.
        // 2. Print the result.
        String result = "";
        for (int i = 0; i < phrase.length(); i++)
            result = result + phrase.charAt(i) + phrase.charAt(i);
        System.out.println(result);

        // Examples
        // ===============
        // "dog" -> "ddoogg"
        // "what?" -> "wwhhaatt??"
        // "" -> "" (empty string has nothing to double)
        // " " -> "  " (but whitespace should be doubled)
        // "open & shut" -> "ooppeenn  &&  sshhuutt"
        // "Eep" -> "EEeepp"
    }
}
