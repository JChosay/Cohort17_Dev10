public class Exercise06 {

    // 1. Create a method.
    // Name: isBetween
    // Inputs: int, int, int
    // Output: boolean
    // Description: return true if the first parameter is between the second and third parameter.
    // Otherwise, returns false.

    public static boolean isBetween (int start, int check, int end){
        if (check >= start && check <= end)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        System.out.printf("Is 5 between 1 and 9? Result: %b", isBetween(1, 5, 9));
        System.out.printf("\nIs 10 between 1 and 9? Result: %b", isBetween(1, 10, 9));
        System.out.printf("\nIs 0 between 1 and 9? Result: %b", isBetween(1, 0, 9));
    }
}
