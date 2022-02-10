public class Exercise07 {

    // 1. Create a method.
    // Name: areInOrder
    // Inputs: int, int, int, int
    // Output: boolean
    // Description: return true if the four parameters are in ascending order.
    // Otherwise, returns false.
    public static boolean areInOrder (int first, int second, int third, int fourth){
        if (first <= second && second <= third && third <= fourth)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        System.out.printf("Are 1, 2, 3, 4 in order? Result: %b", areInOrder(1, 2,3,4));
        System.out.printf("\nAre 2, 2, 3, 3 in order? Result: %b", areInOrder(2, 2,3,3));
        System.out.printf("\nAre 5, 4, 3, 2 in order? Result: %b", areInOrder(5, 4,3,2));
        System.out.printf("\nAre 1, 2, 5, 4 in order? Result: %b", areInOrder(1, 2,5,4));
    }
}
