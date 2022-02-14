import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // BALLOON GAME
        Scanner console = new Scanner(System.in);

        // 1. Instantiate three balloons of different colors.
        Balloon one = new Balloon("red");
        Balloon two = new Balloon("green");
        Balloon three = new Balloon("blue");

        do {
            System.out.println("Inflate? [y/n]: ");
            if (console.nextLine().equalsIgnoreCase("y")) {
                // 2. If the user confirms an inflate, inflate each balloon.
                one.inflate();
                two.inflate();
                three.inflate();
            }
            // 3. When one or more balloons explode, stop the loop.
            if (one.isExploded() || two.isExploded() || three.isExploded())
                break;
        } while (true);

        // 4. Print the color of the winners (balloons that exploded).
        System.out.println("Winners:");
        System.out.printf(one.isExploded() ? one.getColor() + " exploded!\n" : "");
        System.out.printf(two.isExploded() ? two.getColor() + " exploded!\n" : "");
        System.out.printf(three.isExploded() ? three.getColor() + " exploded!\n" : "");
    }
}
