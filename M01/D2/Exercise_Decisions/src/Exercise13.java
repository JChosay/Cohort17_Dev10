import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        // NEEDLE & HAYSTACK
        Scanner console = new Scanner(System.in);

        System.out.print("Needle: ");
        String needle = console.nextLine();

        System.out.print("Haystack: ");
        String haystack = console.nextLine();

        // 1. Given two string variables: needle and haystack, determine if haystack contains needle.
        // Examples
        // needle  haystack contains?
        //     an      bean      yes
        //    een      bean       no
        //    ury   Mercury      yes
        //    ury     curry       no
        //    mer   Mercury       no (case sensitive)
        // 2. As a stretch goal, display the location (index) of needle in haystack.
        if(haystack.contains(needle))
            System.out.printf("Needle (%s) is in the haystack (%s) at index (%d).", needle, haystack, haystack.indexOf(needle));
        else
            System.out.printf("Needle (%s) is not in the haystack (%s).", needle, haystack);
    }
}
