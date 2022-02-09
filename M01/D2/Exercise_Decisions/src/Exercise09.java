import java.util.Scanner;
public class Exercise09 {
    public static void main(String[] args) {
        int min, max, actual;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a minimum value: ");
        min = Integer.parseInt(console.nextLine());
        System.out.print("Enter a maximum value: ");
        max = Integer.parseInt(console.nextLine());
        System.out.print("Enter the actual value: ");
        actual = Integer.parseInt(console.nextLine());

        if (actual >= min && actual <= max)
            System.out.printf("%d is between %d and %d.", actual, min, max);
        else
            System.out.printf("%d is not between %d and %d.", actual, min, max);
    }
}
