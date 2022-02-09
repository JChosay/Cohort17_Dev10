public class Exercise16 {

    public static void main(String[] args) {
        // BORDER BOX
        // 1. Use nested loops to print a box in the console with a different character for the border.
        // One loop should represent rows and the other should represent columns.
        // The border character should be different from the internal box character.
        // 2. Change the row and column limit to change the shape of the box.

        int row = 5, column = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                // top and bottom borders
                if (i == 0 || i == (row - 1))
                    System.out.print('*');
                // left and right borders
                else if (j == 0 || j == (column - 1))
                    System.out.print('*');
                else
                    System.out.print('#');
            System.out.print('\n');
        }

        // Expected Output (5X5)
        // *****
        // *###*
        // *###*
        // *###*
        // *****

        // (3X4)
        // ****
        // *##*
        // ****

        // (2X2)
        // **
        // **
    }
}
