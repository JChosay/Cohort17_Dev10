public class Exercise09 {

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        printBox(3, 3);
        printBox(5,5);
        printBox(2,2);
    }

    // 1. Create a method.
    // Name: printBox
    // Inputs: int, int
    // Output: void
    // Description: prints a visual box to the console. The first parameter is the number of rows to print.
    // The second parameter is the number of columns.
    // See repetition Exercise15.
    public static void printBox (int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print('#');
            System.out.print('\n');
        }
        System.out.print('\n');
    }
    // Expected Output (5 rows, 5 columns)
    // #####
    // #####
    // #####
    // #####
    // #####

    // (3 rows, 4 columns)
    // ####
    // ####
    // ####
}
