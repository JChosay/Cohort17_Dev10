public class Exercise15 {

    public static void main(String[] args) {
        // BOX
        // 1. Use nested loops to print a box in the console.
        // One loop should represent rows and the other should represent columns.
        // 2. Change the row and column limit to change the shape of the box.

        int row = 3, column = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print('#');
            System.out.print('\n');
        }
        // Expected Output (5X5)
        // #####
        // #####
        // #####
        // #####
        // #####

        // (3X4)
        // ####
        // ####
        // ####
    }
}
