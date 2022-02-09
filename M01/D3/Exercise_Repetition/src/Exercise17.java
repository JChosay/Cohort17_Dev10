import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        // USER-DEFINED BOX
        // 1. Collect the following from a user: rows, columns, box character, border character.
        // 2. Use nested loops to print a user-defined box in the console.
        // (See Exercise16.)
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = Integer.parseInt(console.nextLine());
        System.out.print("Enter number of columns: ");
        int column = Integer.parseInt(console.nextLine());
        System.out.print("Enter box character: ");
        char box = console.nextLine().charAt(0);
        System.out.print("Enter border character: ");
        char border = console.nextLine().charAt(0);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                // top and bottom borders
                if (i == 0 || i == (row - 1))
                    System.out.print(border);
                    // left and right borders
                else if (j == 0 || j == (column - 1))
                    System.out.print(border);
                else
                    System.out.print(box);
            System.out.print('\n');
        }
    }
}
