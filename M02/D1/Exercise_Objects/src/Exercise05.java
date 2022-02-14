import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Musician[] musicians = new Musician[5];
        for (int i = 0; i < 5; i++)
        {
            musicians[i] = new Musician();
            System.out.print("Musician name: ");
            musicians[i].setName(console.nextLine());
            System.out.print("Musician rating: ");
            int rating = Integer.parseInt(console.nextLine());
            musicians[i].setRating(rating);
        }

        // 1. Use a loop to populate the `musicians` array with your top 5 favorite musicians.
        // (Replace Frank Ocean.)
        // Create musicians from user input. (See Exercise04.)

        // 2. Use a second loop to print details about each musician.
        for (int i = 0; i < 5; i++)
            System.out.printf("%s: %s%n", musicians[i].getName(), musicians[i].getRating());
    }
}
